package innerclass;

import timer.TimerPrinter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.*;


public class InnerClassTest {
    public static void main(String[] args) {
        TalkingClock clock = new TalkingClock(1000, true);
        clock.start();

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

class TalkingClock {
    private int interval;
    private boolean beep;

    protected TalkingClock(int interval, boolean beep) {
        this.beep = beep;
        this.interval = interval;
    }

    public void start() {
        TimerPrinter listner = new TimerPrinter();
        Timer timer = new Timer(interval, listner);
        timer.start();
    }

    public class TimePrinter implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            System.out.println("At the tone, the time is"
                    + Instant.ofEpochMilli(event.getWhen()));
            if (beep) Toolkit.getDefaultToolkit().beep();
        }
    }
}
