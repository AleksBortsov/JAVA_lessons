package SwingJava;

import javax.swing.*;
import java.awt.*;

public class SimpleFrameTest {
    private static final String TITLE = "My first Jframe";
    public static final int MESSAGE_X = 75;
    public static final int MESSAGE_Y = 100;

    public void painComponent(Graphics graphics) {
        graphics.drawString("Not a HW", MESSAGE_X, MESSAGE_Y);
    }

    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        int screenWeight = screenSize.width;
        int screenHeight = screenSize.height;
        toolkit.setDynamicLayout(true);

        Image img = new ImageIcon("icon.gif").getImage();
        EventQueue.invokeLater(() ->
        {
            SimpleFrame frame = new SimpleFrame();
            frame.setSize(screenHeight / 2, screenWeight / 4);
            frame.setIconImage(img);
            frame.setDefaultCloseOperation(
                    JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            frame.setLocation(200, 300);
//            frame.setBounds(200, 200, 200, 200);
//            frame.dispose();
            frame.setTitle(TITLE);
            frame.setResizable(false);
        });
    }
}

class SimpleFrame extends JFrame {
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFUULT_HEIGHT = 300;

    public SimpleFrame() {
        setSize(DEFAULT_WIDTH, DEFUULT_HEIGHT);
    }
}
