package NewThread;

import javax.swing.plaf.TableHeaderUI;

public class MainThread {
    private static final int DELAY = 10;
    private static final int STEPS = 5;
    private static final double MAX_AMOUNT = 1000;


    public static void main(String[] args) {
        PrivatBank privatBank = new PrivatBank(3, 1000);
        MonoBank monoBank = new MonoBank(3, 1000);
        PUMBbank pumBbank = new PUMBbank(3, 1000);

        Runnable thread_0 = () -> {
            try {
                for (int i = 0; i < STEPS; i++) {
                    double amount = MAX_AMOUNT * Math.random();
                    privatBank.transfer(0, 1, amount);
                    Thread.sleep((int) (DELAY * Math.random()));
                }
            } catch (InterruptedException e) {
            }
        };

        Runnable thread_1 = () -> {
            try {
                for (int i = 0; i < STEPS; i++) {
                    double amount = MAX_AMOUNT * Math.random();
                    privatBank.transfer(1, 2, amount);
                    Thread.sleep((int) (DELAY * Math.random()));
                }
            } catch (InterruptedException e) {
            }
        };
        Runnable thread_2 = () -> {
            try {
                for (int i = 0; i < STEPS; i++) {
                    double amount = MAX_AMOUNT * Math.random();
                    monoBank.transferMono(0, 1, amount);
                    Thread.sleep((int) (DELAY * Math.random()));
                }
            } catch (InterruptedException e) {
            }
        };
        Runnable thread_3 = () -> {
            try {
                for (int i = 0; i < STEPS; i++) {
                    double amount = MAX_AMOUNT * Math.random();
                    monoBank.transferMono(1, 2, amount);
                    Thread.sleep((int) (DELAY * Math.random()));
                }
            } catch (InterruptedException e) {
            }
        };
        Runnable thread_4 = () -> {
            try {
                for (int i = 0; i < STEPS; i++) {
                    double amount = MAX_AMOUNT * Math.random();
                    pumBbank.transferPUMB(0, 1, amount);
                    Thread.sleep((int) (DELAY * Math.random()));
                }

            } catch (InterruptedException e) {
            }
        };

        Runnable thread_5 = () -> {
            try {
                for (int i = 0; i < STEPS; i++) {
                    double amount = MAX_AMOUNT * Math.random();
                    pumBbank.transferPUMB(1, 2, amount);
                    Thread.sleep((int) (DELAY * Math.random()));
                }
            } catch (InterruptedException e) {
            }
        };
        //call thread t1
        Thread t1 = new Thread(thread_0);
        t1.start();
        //same call thread in code below
        new Thread(thread_1).start();

        new Thread(thread_2).start();
        new Thread(thread_3).start();

        new Thread(thread_4).start();
        new Thread(thread_5).start();
    }
}