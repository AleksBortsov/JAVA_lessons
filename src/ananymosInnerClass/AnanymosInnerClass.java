package ananymosInnerClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

public class AnanymosInnerClass {
    public static void main(String[] args) {
        TalkingClock clock = new TalkingClock();
        clock.start(1000, true);
        JOptionPane.showMessageDialog(null, "Quit window?");
        System.exit(0);
    }
}

class TalkingClock {
    public void start(int interval, boolean beep) {
        ActionListener actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.out.println("At tone my time: " + Instant.ofEpochMilli(event.getWhen()));
                if (beep) Toolkit.getDefaultToolkit().beep();
            }
        };

        Timer timer = new Timer(interval, actionListener);
        timer.start();

    }
}