package SwingJava;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class DrawTest extends JFrame {
    private static final String drawTest = "Draw test";

    public static void main(String[] args) {
        EventQueue.invokeLater(() ->
                {
                    DrawFrame frame = new DrawFrame();
                    frame.setTitle(drawTest);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setVisible(true);
                }
        );
    }
}

class DrawFrame extends JFrame {
    public DrawFrame() {
        add(new DrawComponent());
        pack();
    }
}

class DrawComponent extends JComponent {

    private static final int WIDTH = 700;
    private static final int HEIGN = 700;

    protected void paintComponent(Graphics graphics) {

        Graphics2D g2 = (Graphics2D) graphics;

        double leftX = 100;
        double topY = 100;
        double width = 200;
        double heigh = 150;

        Rectangle2D rectangle2D = new Rectangle2D.Double(leftX, topY, width, heigh);
        g2.draw(rectangle2D);

        Ellipse2D ellipse2D = new Ellipse2D.Double();
        ellipse2D.setFrame(rectangle2D);
        g2.draw(ellipse2D);
        g2.draw(new Line2D.Double(leftX, topY, leftX + width, topY + heigh));

        double centerX = rectangle2D.getCenterX();
        double centerY = rectangle2D.getCenterY();
        double radius = 150;

        Ellipse2D circle = new Ellipse2D.Double();
        circle.setFrameFromCenter(centerX, centerY, centerX + radius, centerY + radius);
        g2.draw(circle);
        g2.setPaint(Color.cyan);
        g2.fill(ellipse2D);
    }

    public Dimension getPreferredSize() {
        return new Dimension(WIDTH, HEIGN);
    }
}