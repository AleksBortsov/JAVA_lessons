package NewThread;

import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrivatBank {
    private final double[] accounts;
    private Lock myLock = new ReentrantLock();

    public PrivatBank(int n, double initialBalance) {
        accounts = new double[n];
        Arrays.fill(accounts, initialBalance);
    }

    public void transfer(int from, int to, double amount) {
        myLock.lock();
        try {
            System.out.println("myLock");
            if (accounts[from] < amount) {
                System.out.println("недостаточно средств на счету. At accounts[from]: "
                        + accounts[from] + " \namount: " + amount);
                System.out.println();
                return;
            }
            System.out.println(Thread.currentThread());

            accounts[from] = accounts[from] - amount;
            System.out.printf(" %10.2f from %d to %d", amount, from, to);
            System.out.println("\nballance in PrivatBank account[from]: " + accounts[from]);

            accounts[to] = accounts[to] + amount;
            System.out.printf("\nTotal balance : %10.2f ", getTotalBalance());
            System.out.println("\nballance in PrivatBank  account[to]: " + accounts[to]);
        } finally {
            myLock.unlock();
        }
    }

    public double getTotalBalance() {
        myLock.lock();
        try {
            double sum = 0;
            for (double a : accounts)
                sum = sum + a;
            return sum;
        } finally {
            myLock.unlock();
        }

    }

    public int size() {
        return accounts.length;
    }
}