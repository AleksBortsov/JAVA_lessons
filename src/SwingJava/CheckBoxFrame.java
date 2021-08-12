package SwingJava;

import javafx.scene.control.CheckBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CheckBoxFrame extends JFrame {
    private JLabel label;
    private JCheckBox bold;
    private JCheckBox italic;
    private static final int FONTSIZE = 18;

    private JPanel buttonPanel;
    private ButtonGroup group;

    public static void main(String[] args) {
        EventQueue.invokeLater(() ->
                {
                    CheckBoxFrame checkBoxFrame = new CheckBoxFrame();
                    checkBoxFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    checkBoxFrame.setVisible(true);
                    checkBoxFrame.setSize(600, 300);

                }
        );
    }

    public CheckBoxFrame() {
        label = new JLabel("This is my sentence! "
                + " It can be more?!");
        label.setFont(new Font("Serif", Font.PLAIN, FONTSIZE));
        add(label, BorderLayout.CENTER);
        //new insert START
        buttonPanel = new JPanel();
        group = new ButtonGroup();
        addRadioButton("Small", 8);
        addRadioButton("Medium", 12);
        addRadioButton("Large", 18);
        addRadioButton("Extra large", 36);
        add(buttonPanel, BorderLayout.SOUTH);
        pack();

//        ActionListener listener = e -> {
//            int mode = 0;
//            if (bold.isSelected()) mode += Font.BOLD;
//            if (italic.isSelected()) mode += Font.ITALIC;
//
//            label.setFont(new Font("Serif", mode, FONTSIZE));
//        };

//        JPanel buttonPanel = new JPanel();
//        bold = new JCheckBox("Bold");
//        bold.addActionListener(listener);
//        bold.setSelected(true);
//        buttonPanel.add(bold);

//        italic = new JCheckBox("Italic");
//        italic.addActionListener(listener);
//        buttonPanel.add(italic);
//
//        add(buttonPanel, BorderLayout.SOUTH);
    }

    public void addRadioButton(String name, int size) {
        boolean selected = size == FONTSIZE;
        JRadioButton button = new JRadioButton(name, selected);
        group.add(button);
        buttonPanel.add(button);

        ActionListener listener2 = e ->
                label.setFont(new Font("Serif", Font.PLAIN, size));
        button.addActionListener(listener2);

    }
}