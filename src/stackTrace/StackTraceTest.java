package stackTrace;

import javax.swing.*;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;
import java.util.logging.LogRecord;
import java.util.logging.StreamHandler;

public class StackTraceTest extends StreamHandler {
    public static int factorial(int n) {
        System.out.println("factorial (" + n + " ): ");
        StackWalker walker = StackWalker.getInstance();
        walker.forEach(System.out::println);
        int r;
        if (n <= 1) r = 1;
        else r = n * factorial(n - 1);
        System.out.println(" return " + r);
        return r;
    }

    public void publish(LogRecord record) {
        super.publish(record);
        flush();
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter n: ");
            int n = in.nextInt();
            factorial(n);
        }
    }

    public StackTraceTest() {
        JTextArea outputJTA = new JTextArea();
        setOutputStream(new OutputStream() {
            @Override
            public void write(int b) throws IOException {
            }

            public void write(byte[] b, int off, int len) {
                outputJTA.append(new String(b, off, len));
            }
        });
    }
}
