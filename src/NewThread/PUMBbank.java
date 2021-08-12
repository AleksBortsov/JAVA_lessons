package NewThread;

import java.util.Arrays;

public class PUMBbank {
    private final double accountsPUMB[];
    private Object lock = new Object();

    public PUMBbank(int nPUMB, double initialBallancePUMB) {
        accountsPUMB = new double[nPUMB];
        Arrays.fill(accountsPUMB, initialBallancePUMB);
    }

    protected synchronized void transferPUMB(int fromPUMB, int toPUMB,
                                             double amountPUMB) throws InterruptedException {
        synchronized (lock) {
        }

        while (accountsPUMB[fromPUMB] < amountPUMB) {
            System.out.println("\nнедостаточно средств на счету accountsPUMB[fromPUMB]: " +
                    accountsPUMB[fromPUMB] + " \namount PUMB: " + amountPUMB);
            wait();
        }
        accountsPUMB[fromPUMB] = accountsPUMB[fromPUMB] - amountPUMB;
        System.out.println("\nСумма на счету accountsPUMB[fromPUMB]: " + accountsPUMB[fromPUMB]);
        System.out.println("\nСумма на счету accountsPUMB[toPUMB]: " + accountsPUMB[toPUMB]);
        accountsPUMB[toPUMB] = accountsPUMB[toPUMB] + amountPUMB;
        System.out.println("\nСумма на счету accountsPUMB[toPUMB]: " + accountsPUMB[toPUMB]);
        System.out.println("\nTotal ballance accountsPUMB: " + getTotalBallancePUMB());
        notifyAll();
    }

    protected synchronized double getTotalBallancePUMB() {
        double sumPUMB = 0;
        for (double a : accountsPUMB)
            sumPUMB = sumPUMB + a;
        return sumPUMB;
    }
}
