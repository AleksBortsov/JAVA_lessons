package SwingJava;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonFrame extends JFrame {
    private JPanel buttonPanel;
    private static final int WIDTH_DEF = 300;
    private static final int HEIGHT_DEF = 200;

    public static void main(String[] args) {
        EventQueue.invokeLater(() ->
        {
            ButtonFrame buttonFrame = new ButtonFrame();
            buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            buttonFrame.setVisible(true);

        });
    }


    public ButtonFrame() {
        setSize(HEIGHT_DEF, WIDTH_DEF);
        JButton yelowBtn = new JButton("Yelow");
        JButton blueBtn = new JButton("Blue");
        JButton redBtn = new JButton("Red");
        buttonPanel = new JPanel();
        buttonPanel.add(yelowBtn);
        buttonPanel.add(blueBtn);
        buttonPanel.add(redBtn);

        add(buttonPanel);

        ColorAction yellowAction = new ColorAction(getName(), Color.YELLOW);
        ColorAction blueAction = new ColorAction(getName(), Color.BLUE);
        ColorAction redAction = new ColorAction(getName(), Color.RED);

        yelowBtn.addActionListener(yellowAction);
        blueBtn.addActionListener(blueAction);
        redBtn.addActionListener(redAction);
    }

    private class ColorAction extends AbstractAction implements ActionListener {
        public Color backGroundColor;

        public ColorAction(String name, Color color) {
            putValue(Action.NAME, name);
//            putValue(Action.SMALL_ICON, icon);
            putValue("color", color);
            putValue(Action.SHORT_DESCRIPTION, "Set panel color to" + name.toLowerCase());
            backGroundColor = color;
//        public ColorAction(Color name, icon, color) {
//                backGroundColor = c;
        }

//        public ColorAction(String name, Icon icon, Color color) {
//            putValue(Action.NAME, name);
//            putValue(Action.SMALL_ICON, icon);
//            putValue("color", color);
//            putValue(Action.SHORT_DESCRIPTION, "Set panel color to" + name.toLowerCase());
//        }

        @Override
        public void actionPerformed(ActionEvent event) {
            Color color = (Color) getValue("color");
            buttonPanel.setBackground(backGroundColor);
        }
    }
}