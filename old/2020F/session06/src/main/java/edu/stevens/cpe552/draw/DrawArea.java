package edu.stevens.cpe552.draw;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

/**
 *
 * @author dkruger
 */
public class DrawArea extends JPanel {
    private ArrayList<Shape> shapes;

    private final static Cursor crosshairs = new Cursor(Cursor.CROSSHAIR_CURSOR);
    private final static Cursor defaultCursor = new Cursor(Cursor.DEFAULT_CURSOR);
            
    public DrawArea() {
        shapes = new ArrayList<>();
//        shapes.add(new Rect(10, 20, 100, 50));
//        shapes.add(new Rect(300, 200, 200, 400));
        DrawListener d = new DrawListener();
        addMouseListener(d);
        addMouseMotionListener(d);
    }
    public void paint(Graphics g) {
        //for (int i = 0; i < shapes.size(); i++)
        //    shapes.get(i).draw(g)
        for (Shape s : shapes)
           s.draw(g);
    }



    class DrawListener implements MouseListener, MouseMotionListener {
        private int pressx, pressy;
        private Shape current;
        @Override
        public void mouseClicked(MouseEvent e) {
            
        }

        @Override
        public void mousePressed(MouseEvent e) {
            pressx = e.getX();  pressy = e.getY();
            current = new Rect(pressx, pressy,0,0);
            shapes.add(current);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            current.setSecondPoint(e.getX(), e.getY());
            repaint();
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            setCursor(crosshairs);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            setCursor(defaultCursor);                        
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            Graphics g = getGraphics();
            g.setXORMode(Color.gray);
            current.draw(g);
            current.setSecondPoint(e.getX(), e.getY());
            current.draw(g);
        }

        @Override
        public void mouseMoved(MouseEvent arg0) {
            
        }
        
    }
}
