import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.event.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class Box extends JComponent{

    private int side, x, y;
    private Rectangle2D b;

    public Box(int side, int x, int y){
        this.side = side;
        this.x = x;
        this.y = y;
        b = new Rectangle2D.Double(x,y,side,side);
    }

    // Draws the box
    @Override
    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        rh.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2d.setRenderingHints(rh);
        g2d.setStroke(new BasicStroke(1));
        g2d.setColor(Color.black);
        g2d.draw(b);
    }

    // Fills box with color c
    public void fill(Graphics2D g2d, Color c){
        g2d.setColor(c);
        g2d.fill(b);
    }
}
