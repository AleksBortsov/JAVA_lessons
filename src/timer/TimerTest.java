package timer;


import javax.swing.*;

public class TimerTest {
    public static void main(String[] args) {
        TimerPrinter listner = new TimerPrinter();
        Timer timer = new Timer(1000, listner);
        timer.start();

        JOptionPane.showMessageDialog(null, "Quit program? ");
        System.exit(0);
    }
}
