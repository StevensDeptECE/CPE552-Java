package edu.stevens.draw2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class DrawArea extends JPanel {
    private DrawMode mode;
    private ArrayList<Shape> shapes;
    public DrawArea() {
        shapes = new ArrayList<>(); // empty list
        mode = new CircleMode();
        MouseClickListener m = new MouseClickListener();
        addMouseListener(m);
        addMouseMotionListener(m);
    }

    public DrawMode getMode() { return mode; }
    public void setMode(DrawMode mode) { this.mode = mode; }
    class MouseClickListener  implements MouseListener, MouseMotionListener {
        @Override public void mouseClicked(MouseEvent e) {
        }
        @Override public void mousePressed(MouseEvent e) {
            mode.press(e.getX(), e.getY());
            //
        }
        @Override public void mouseDragged(MouseEvent e) {
            Shape s = mode.getCurrent();
            Graphics g = getGraphics();
            g.setXORMode(Color.WHITE);
            // red = 255,0,0
            // XOR with 255,255,255
            //       0, 255, 255
            //       255, 0, 0
            s.draw(g);
            mode.release(e.getX(), e.getY()); //
            s.draw(g);
        }

        @Override public void mouseMoved(MouseEvent e) {}


            @Override public void mouseReleased(MouseEvent e) {
            mode.release(e.getX(), e.getY()); //
            Shape s = mode.getCurrent();
            shapes.add(s);
            Graphics g = getGraphics();
            s.draw(g);
        }

        @Override public void mouseEntered(MouseEvent e) {}

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }
    public void paint(Graphics g) {
        for (Shape s : shapes) {
            s.draw(g);
        }
    }
    public void addCircle(int x, int y, int r) {
        shapes.add(new Circle(x,y,r));
    }
    public void addRect(int x, int y, int w, int h) {
        shapes.add(new Rect(x,y,w,h));
    }
}
