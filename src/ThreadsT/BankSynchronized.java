package ThreadsT;

import javax.swing.plaf.TableHeaderUI;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

public class BankSynchronized {

    private double accounts[];

    public synchronized void transfer(int from, int to, int amount) throws InterruptedException {
        while (accounts[from] < amount)
            wait();
        System.out.println(Thread.currentThread());
        accounts[from] = accounts[from] - amount;
        System.out.printf(" %10.2f from %d to %d" , amount, from, to);

        accounts[to] = accounts[to] + amount;
        System.out.printf(". Total balance: %10.2f%n" , getTotalBalance());
        notifyAll();
        System.out.println(dateStamp);
    }
    public static final ThreadLocal<SimpleDateFormat> dateFormat=
            ThreadLocal.withInitial(()->new SimpleDateFormat("yyyy-MM-dd"));
    String dateStamp=dateFormat.get().format(new Date());

    public synchronized double getTotalBalance() {
        double sum = 0;
        for (double a : accounts)
            sum += a;
        return sum;
    }

    public void transfer2(Vector<Double> accounts2, int from, int to, int amount) {
        synchronized (accounts2) {
            accounts2.set(from, accounts2.get(from) - amount);
            accounts2.set(to, accounts2.get(to) + amount);
        }
        System.out.println(accounts2);
    }

    public int size() {
        return accounts.length;
    }
}
