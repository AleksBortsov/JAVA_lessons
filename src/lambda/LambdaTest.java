package lambda;

import javax.swing.*;
import java.awt.*;
import java.time.Instant;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class LambdaTest {
    public static void main(String[] args) {
        String planets[] = new String[]{"Mercury", "Mars", "Venus", "Saturn", "Jupiter", "Neptune", "Uranus"};
        System.out.println(Arrays.toString(planets));

        System.out.println("Sorted in dictionary order: ");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));

        System.out.println("Sorted by length: ");
        Arrays.sort(planets, (first, second) -> first.length() - second.length());
        System.out.println(Arrays.toString(planets));

        Timer t = new Timer(5000, event -> System.out.println("The time is: " + new Date()));
        t.start();
        JOptionPane.showMessageDialog(null,
                "Quit program? ");
        System.exit(1);

        /*Timer timer=new Timer(1000, time->
                System.out.println("At the tone, the time is "
                        + Instant.ofEpochMilli(time.getWhen())));
        Toolkit.getDefaultToolkit().beep();
        timer.start();*/
    }
}
