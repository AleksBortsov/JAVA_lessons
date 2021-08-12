package ThreadsT;

public class UnsynchBankTest {
    public static final int NACCOUNTS = 5;
    public static final double INITIAL_BALLANCE = 1000;
    public static final double MAX_AMOUNT = 10000;
    public static final int DELAY = 10;

    public static void main(String[] args) {
        Bank bank = new Bank(NACCOUNTS, INITIAL_BALLANCE);
        for (int i = 0; i < NACCOUNTS; i++) {
            int fromAccount = i;

            Runnable r = () -> {
                try {
                    while (true) {
                        int toAccount = (int) (bank.size() * Math.random());
                        double amount = MAX_AMOUNT * Math.random();
                        bank.transfer(fromAccount, toAccount, amount);
                        Thread.sleep((long) ((DELAY * Math.random())));
                    }
                } catch (InterruptedException e) {
                }
            };
            Thread thread = new Thread(r);
            thread.start();
        }
    }
}