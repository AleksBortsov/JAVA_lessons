package SwingJava;

import org.w3c.dom.css.Rect;

import javax.swing.*;
import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class FontTest {
    protected static final String FONT_TEST = "Font Test";

    public static void main(String[] args) {
        EventQueue.invokeLater(() ->
        {
            FontFrame frame = new FontFrame();
            frame.setTitle(FONT_TEST);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

class FontFrame extends JFrame {
    protected FontFrame() {
        add(new FontComponent());
        pack();
    }
}

class FontComponent extends JComponent {
    private static final int DEF_WIDTH = 300;
    private static final int DEF_HEIGHT = 300;

    public static final String MESSAGE = "Hello JAVA world";


    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Font f = new Font("Serif", Font.BOLD, 36);
        g2.setFont(f);
        FontRenderContext context = g2.getFontRenderContext();
        Rectangle2D bounds = f.getStringBounds(MESSAGE, context);

        double x = (getWidth() - bounds.getWidth()) / 2;
        double y = (getHeight() - bounds.getHeight()) / 2;
        double ascent = -bounds.getY();
        double baseY = y + ascent;

        g2.drawString(MESSAGE, (int) x, (int) baseY);
        g2.setPaint(Color.LIGHT_GRAY);

        g2.draw(new Line2D.Double(x, baseY, x + bounds.getWidth(), baseY));

        Rectangle2D rect = new Rectangle2D.Double(x, baseY, x + bounds.getWidth(), baseY);
        g2.draw(rect);

    }

    public Dimension getPreferredSize() {
        return new Dimension(DEF_WIDTH, DEF_HEIGHT);
    }
}