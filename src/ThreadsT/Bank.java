package ThreadsT;

import java.util.Arrays;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bank {

    private Lock bankLock = new ReentrantLock();
    private Condition sufficientFounds;

    private final double[] accounts;

    public Bank(int n, double initialBance) {
        accounts = new double[n];
        Arrays.fill(accounts, initialBance);
    }

    public void transfer(int from, int to, double amount) throws InterruptedException {

        this.bankLock.lock();
        //if (accounts[from] < amount) return;

        try {
            while (accounts[from] < amount)
                sufficientFounds.await();

            System.out.print(Thread.currentThread());

            accounts[from] = accounts[from] - amount;
            System.out.printf("%10.2f from %d to %d  ", amount, from, to);

            accounts[to] = accounts[to] + amount;
            System.out.printf(" Total balance: %10.2f%n  ", getTotalBalance());
            sufficientFounds.signal();

        } catch (Exception e) {

        } finally {
            this.bankLock.unlock();
        }
    }

    public double getTotalBalance() {
        bankLock.lock();
        try {
            double sum = 0;
            for (double a : accounts)
                sum += a;
            return sum;
        } finally {
            bankLock.unlock();
        }
    }

    public int size() {
        return accounts.length;
    }
}