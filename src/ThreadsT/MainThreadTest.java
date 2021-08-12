package ThreadsT;

import java.time.Clock;

public class MainThreadTest {
    public static final int DELAY = 100;
    public static final int STEPS = 10;
    public static final int MAX_AMOUNT = 1000;

    public static void main(String[] args) {
        Bank bank = new Bank(4, 10000);

        Runnable task1 = () -> {
            try {
                for (int i = 0; i < STEPS; i++) {
                    double amount = MAX_AMOUNT * Math.random();
                    bank.transfer(0, 1, amount);
                    Thread.sleep((int) (DELAY * Math.random()));
                }
            } catch (InterruptedException e) {
            }
        };

        Runnable task2 = () -> {
            try {
                for (int i = 0; i < STEPS; i++) {
                    double amount = MAX_AMOUNT * Math.random();
                    bank.transfer(2, 3, amount);
                    Thread.sleep((int) (DELAY * Math.random()));
                }
            } catch (InterruptedException e) {
            }
        };

        Thread t1 = new Thread(task1);
        t1.setName("deamon task1");
        t1.setDaemon(true);
        t1.start();

        Thread t2 = new Thread(task2);
        t2.setName("THREAD task2 ");
        t2.start();
        t2.setPriority(1);
    }
}