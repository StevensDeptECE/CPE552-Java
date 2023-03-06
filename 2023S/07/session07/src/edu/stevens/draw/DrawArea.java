package edu.stevens.draw;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class DrawArea extends JPanel {
    private DrawMode mode;
    private ArrayList<Shape> shapes;
    public DrawArea() {
        shapes = new ArrayList<>(); // empty list
        mode = new CircleMode();
        addMouseListener(new MouseClickListener());
    }

    public DrawMode getMode() { return mode; }
    public void setMode(DrawMode mode) { this.mode = mode; }
    class MouseClickListener  implements MouseListener {

        @Override public void mouseClicked(MouseEvent e) {
        }
        @Override public void mousePressed(MouseEvent e) {
            Shape s = mode.buildit(e.getX(), e.getY(), 50,50);
            shapes.add(s);
//            shapes.add(new Circle( e.getX(), e.getY(), 50));
            Graphics g = getGraphics();
            s.draw(g);
        }
        @Override public void mouseReleased(MouseEvent e) {}

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
