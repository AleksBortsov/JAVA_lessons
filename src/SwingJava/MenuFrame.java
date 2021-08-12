package SwingJava;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuFrame extends JFrame {

    public static void main(String[] args) {
        EventQueue.invokeLater(() ->
        {
            MenuFrame menuFrame = new MenuFrame();
            menuFrame.setVisible(true);
            menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            menuFrame.setName("Menu application");
        });
    }

    private static final int WIDTH = 600;
    private static final int HEIGH = 600;
    private Action saveAction;
    private Action saveAsAction;

    private JCheckBoxMenuItem readOnlyItem;
    private JPopupMenu popup;

    class TestAction extends AbstractAction {
        public TestAction(String name) {
            super(name);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(getValue(Action.NAME) + " selected.");
        }
    }

    public MenuFrame() {
        setSize(WIDTH, HEIGH);
        JMenu fileMenu = new JMenu("File");
        fileMenu.add(new TestAction("New"));
        JMenuItem openItem = fileMenu.add(new TestAction("Open"));
        openItem.setAccelerator(KeyStroke.getKeyStroke("cntrl O"));
        fileMenu.addSeparator();

        saveAction = new TestAction("Save");
        JMenuItem saveItem = fileMenu.add(saveAction);
        saveItem.setAccelerator(KeyStroke.getKeyStroke("cntrl S"));

        saveAsAction = new TestAction("Save As");
        fileMenu.add(saveAsAction);
        fileMenu.addSeparator();

        fileMenu.add(new AbstractAction("Exit") {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        readOnlyItem = new JCheckBoxMenuItem("Read only");
        readOnlyItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean saveOk = !readOnlyItem.isSelected();
                saveAction.setEnabled(saveOk);
                saveAsAction.setEnabled(saveOk);
            }
        });
        ButtonGroup group = new ButtonGroup();
        JRadioButtonMenuItem insertIetm = new JRadioButtonMenuItem("insert");
        insertIetm.setSelected(true);
        JRadioButtonMenuItem overTypeItem = new JRadioButtonMenuItem("OverType");

        group.add(insertIetm);
        group.add(overTypeItem);

        TestAction cutAction = new TestAction("Cut");
        cutAction.putValue(Action.SMALL_ICON, new ImageIcon("cut gif"));

        TestAction copyAction = new TestAction("Copy");
        copyAction.putValue(Action.SMALL_ICON, new ImageIcon("copy gif"));

        TestAction pasteAction = new TestAction("paste");
        pasteAction.putValue(Action.SMALL_ICON, new ImageIcon("paste gif"));

        JMenu editMenu = new JMenu("Edit");

        editMenu.add(cutAction);
        editMenu.add(pasteAction);
        editMenu.add(copyAction);

        JMenu optionMenu = new JMenu("Options");
        optionMenu.add(readOnlyItem);
        optionMenu.addSeparator();
        optionMenu.add(insertIetm);
        optionMenu.add(overTypeItem);

        editMenu.addSeparator();
        editMenu.add(optionMenu);

        JMenu helpMenu = new JMenu("Help");
        helpMenu.setMnemonic('H');

        JMenuItem indexItem = new JMenuItem("Index");
        indexItem.setMnemonic('I');
        helpMenu.add(indexItem);

        TestAction aboutAction = new TestAction("About");
        aboutAction.putValue(Action.MNEMONIC_KEY, (int) 'A');
        helpMenu.add(aboutAction);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        popup = new JPopupMenu();
        popup.add(cutAction);
        popup.add(copyAction);
        popup.add(pasteAction);

        JPanel panel = new JPanel();
        panel.setComponentPopupMenu(popup);
        add(panel);

    }
}
