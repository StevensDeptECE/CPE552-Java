package session07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * @author dkruger
 */
public class MouseListenerTest extends JFrame {
    private int lastX, lastY;
    public MouseListenerTest() {
        super("scribble");
        setSize(1000,800);
        Container c = getContentPane();
        DrawingArea d = new DrawingArea();
        d.setBackground(Color.RED);
        c.add(d, BorderLayout.CENTER);
        setVisible(true);
        
    }
    public static void main(String[] args) {
        new MouseListenerTest();
    }
}

class DrawingArea extends JPanel {
    private int lastX, lastY;
    private int gridSize;
    public DrawingArea() {
        gridSize = 20;
        this.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
                lastX = (e.getX() + gridSize/2)/gridSize*gridSize;
                lastY = (e.getY() + gridSize/2)/gridSize*gridSize;
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                DrawingArea.this.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
         
            }
        });
        addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                Graphics g = getGraphics();
                int x = (e.getX() + gridSize/2)/gridSize*gridSize;
                int y = (e.getY() + gridSize/2)/gridSize*gridSize;
                g.drawLine(x, y, lastX, lastY);
                lastX = x; lastY = y;
            }

            @Override
            public void mouseMoved(MouseEvent e) {
            }
            
        });
    }
        

    public void paint(Graphics g) {
       int w = getWidth();
       int h = getHeight();
       g.setColor(Color.GRAY);
       for (int y = gridSize; y < h; y += gridSize)
           g.drawLine(0, y, w, y);
       
       for (int x = gridSize; x < w; x += gridSize)
           g.drawLine(x,0, x,h);
    }

}





