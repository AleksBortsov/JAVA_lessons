import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BasicThreads {
    private static int th=5;
    public static void main(String[] args) {

        ExecutorService ecex= Executors.newFixedThreadPool(th);

        for (int i=0; i<5;i++)
        ecex.execute(new LiftOff());
        ecex.shutdown();
        System.out.println("waiting for LiftOff");
    }
}