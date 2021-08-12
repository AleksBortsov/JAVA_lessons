package NewThread;

import SwingJava.ComboBoxFrame;

import java.util.Arrays;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MonoBank {
    private final double[] accountsMono;
    private Lock myLockMono;
    private Condition sufficientFunds;

    public MonoBank(int nMono, double initialBallanceMono) {
        accountsMono = new double[nMono];
        Arrays.fill(accountsMono, initialBallanceMono);
        myLockMono = new ReentrantLock();
        sufficientFunds = myLockMono.newCondition();
    }

    protected void transferMono(int from, int to, double amountMono)
            throws InterruptedException {
        myLockMono.lock();
        try {
            while (accountsMono[from] < amountMono) {
                System.out.println(" недостаточно стредств на счету accountsMono[from]: "
                        + accountsMono[from] + " \n" + Thread.currentThread() + " \namountMono: " + amountMono);
                sufficientFunds.await();
            }


            accountsMono[from] = accountsMono[from] - amountMono;
            System.out.printf(" %10.2f from %d to %d ", amountMono, from, to);

            accountsMono[to] = accountsMono[to] + amountMono;
            System.out.printf(" \nTotal ballance Mono: %10.2f %n", getTotalBallanceMono());

            sufficientFunds.signalAll();

        } finally {
            myLockMono.unlock();
        }
    }

    private double getTotalBallanceMono() {
        myLockMono.lock();
        try {
            double sumMono = 0;
            for (double a : accountsMono)
                sumMono = sumMono + a;
            return sumMono;
        } finally {
            myLockMono.unlock();
        }
    }

    public int sizeMono() {
        return accountsMono.length;
    }
}
