package SwingJava;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class NhWorld {
    public static void main(String[] args) {
        EventQueue.invokeLater(() ->
                {
                    NhWorldFrame frame = new NhWorldFrame();
                    frame.setTitle("Not Hello World");
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setVisible(true);
                    
                }
        );
    }
}

class NhWorldFrame extends JFrame {
    public NhWorldFrame() {
        add(new NhWorldComponent());
        pack();
    }
}

//class DrawComponent extends JComponent {
//    private static final int DEFAULT_WIDTH = 300;
//    private static final int DEFAULT_HEIGN = 300;
//
//    public void painComponent(Graphics graphics) {
//        Graphics2D g2 = (Graphics2D) graphics;
//        double leftX = 100;
//        double topY = 100;
//        double width = 200;
//        double heigh = 150;
//        Rectangle2D rectangle2D = new Rectangle2D.Double(leftX, topY, width, heigh);
//        g2.draw(rectangle2D);
//        Ellipse2D ellipse2D = new Ellipse2D.Double();
//        ellipse2D.setFrame(rectangle2D);
//        g2.draw(ellipse2D);
//        g2.draw(new Line2D.Double(leftX, topY, leftX + width, topY + heigh));
//        double centerX = rectangle2D.getCenterX();
//        double centerY = rectangle2D.getCenterY();
//        double radius = 150;
//        Ellipse2D circle = new Ellipse2D.Double();
//        circle.setFrameFromCenter(centerX, centerY, centerX + radius, centerY + radius);
//        g2.draw(circle);
//
//    }
//}

class NhWorldComponent extends JComponent {
    public static final int MESSAGE_X = 75;
    public static final int MESSAGE_Y = 100;

    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGN = 300;

    public void paintComponent(Graphics graphics) {
        graphics.drawString("Not a HW", MESSAGE_X, MESSAGE_Y);

    }

    public Dimension getPreferredSize() {
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGN);
    }
}