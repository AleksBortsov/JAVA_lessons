package SwingJava;

import javax.swing.*;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.util.Hashtable;

public class SloderFrame extends JFrame {
    public static void main(String[] args) {
        EventQueue.invokeLater(() ->
        {
            SloderFrame sloderFrame = new SloderFrame();
            sloderFrame.setVisible(true);
            sloderFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            sloderFrame.setSize(2500, 500);
        });
    }

    private JPanel sliderPane;
    private JTextField textField;
    private ChangeListener listener;

    public SloderFrame() {
        sliderPane = new JPanel();
        sliderPane.setLayout(new GridLayout());

        listener = e -> {
            JSlider source = (JSlider) e.getSource();
            textField.setText("" + source.getValue());
        };
        JSlider slider = new JSlider();
        addSlider(slider, "Plain");

        slider = new JSlider();
        slider.setPaintTicks(true);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        addSlider(slider, "Ticks");

        slider = new JSlider();
        slider.setPaintTicks(true);
        slider.setSnapToTicks(true);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        addSlider(slider, "Snap to ticks");


        slider = new JSlider();
        slider.setPaintTicks(true);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        slider.setPaintTrack(false);
        addSlider(slider, "No track");

        slider = new JSlider();
        slider.setPaintTicks(true);
        slider.setInverted(true);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        addSlider(slider, "Inverted");

        slider = new JSlider();
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        addSlider(slider, "Labels");

        slider = new JSlider();
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        Hashtable<Integer, Component> labelTable = new Hashtable<Integer, Component>();
        labelTable.put(0, new JLabel("A"));
        labelTable.put(20, new JLabel("B"));
        labelTable.put(40, new JLabel("C"));
        labelTable.put(50, new JLabel("D"));
        labelTable.put(80, new JLabel("E"));
        labelTable.put(100, new JLabel("F"));

        slider.setLabelTable(labelTable);
        addSlider(slider, "Custom labels");

        slider = new JSlider();
        slider.setPaintTicks(true);
        slider.setSnapToTicks(true);
        slider.setPaintLabels(true);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        Hashtable<Integer, Component> hashtable = new Hashtable<>();
        hashtable.put(0, new JLabel(new ImageIcon("nine.gif")));
        hashtable.put(20, new JLabel(new ImageIcon("ten.gif")));
        hashtable.put(40, new JLabel(new ImageIcon("jack.gif")));
        hashtable.put(60, new JLabel(new ImageIcon("queen.gif")));
        hashtable.put(80, new JLabel(new ImageIcon("king.gif")));
        hashtable.put(100, new JLabel(new ImageIcon("ace.gif")));
        slider.setLabelTable(hashtable);
        addSlider(slider, "Icon labels");

        textField = new JTextField();
        add(sliderPane, BorderLayout.CENTER);
        add(textField, BorderLayout.SOUTH);
        pack();
    }

    public void addSlider(JSlider s, String descriprion) {
        s.addChangeListener(listener);

        JPanel panel = new JPanel();
        panel.add(s);
        panel.add(new JLabel(descriprion));
        panel.setAlignmentX(Component.LEFT_ALIGNMENT);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridy = sliderPane.getComponentCount();
        gbc.anchor = GridBagConstraints.WEST;
        sliderPane.add(panel, gbc);
    }
}
