package SwingJava;


import javax.swing.*;
import java.awt.*;
import java.awt.desktop.QuitEvent;

public class ComboBoxFrame extends JFrame {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
                    ComboBoxFrame comboBoxFrame = new ComboBoxFrame();
                    comboBoxFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    comboBoxFrame.setVisible(true);
                    comboBoxFrame.setSize(600, 600);
                }
        );
    }

    private JComboBox<String> facecombo;
    private JLabel label;

    private static final int DEFAULT_SIZE = 24;

    public ComboBoxFrame() {
        label = new JLabel("My new sentence in JComboBox."
                + " And more words.");
        label.setFont(new Font("Serif", Font.PLAIN, DEFAULT_SIZE));
        add(label, BorderLayout.CENTER);
        facecombo = new JComboBox<String>();
        facecombo.addItem("Serif");
        facecombo.addItem("SansSerif");
        facecombo.addItem("Monospaced");
        facecombo.addItem("Dialog");
        facecombo.addItem("DialogInput");

        facecombo.addActionListener(e ->
                label.setFont(
                        new Font(facecombo.getItemAt(
                                facecombo.getSelectedIndex()), Font.PLAIN, DEFAULT_SIZE)));
        JPanel comboPanel = new JPanel();
        comboPanel.add(facecombo);
        add(comboPanel, BorderLayout.SOUTH);
    }
}