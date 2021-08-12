package SwingJava;

import javax.swing.*;
import java.awt.*;

public class TextComponentFrame extends JFrame {
    public static final int TEXT_AREA_ROWS = 8;
    public static final int TEXT_AREA_COLUMNS = 20;

    public static void main(String[] args) {
        EventQueue.invokeLater(() ->
        {
            TextComponentFrame textComponentFrame = new TextComponentFrame();
            textComponentFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            textComponentFrame.setVisible(true);

        });
    }

    public TextComponentFrame() {

        JTextField textField = new JTextField();
        JPasswordField jPasswordField = new JPasswordField();

        JPanel northPanel = new JPanel();

        northPanel.setLayout(new GridLayout(2, 2));
        northPanel.add(new JLabel("User name: ", SwingConstants.RIGHT));
        northPanel.add(textField);

        northPanel.add(new JLabel("Password: ", SwingConstants.RIGHT));
        northPanel.add(jPasswordField);


        add(northPanel, BorderLayout.NORTH);

        JTextArea textArea = new JTextArea(TEXT_AREA_ROWS, TEXT_AREA_COLUMNS);
        JScrollPane scrollPane = new JScrollPane(textArea);

        northPanel.add(scrollPane, BorderLayout.CENTER);

        JPanel southPanel = new JPanel();

        JButton insertBotton = new JButton("Insert");
        southPanel.add(insertBotton);

        insertBotton.addActionListener(e ->
                textArea.append("User name: " + textField.getText()
                        + ", Password: " + new String(jPasswordField.getPassword())
                        + "\n"));
        add(southPanel, BorderLayout.SOUTH);
        pack();
    }
}
