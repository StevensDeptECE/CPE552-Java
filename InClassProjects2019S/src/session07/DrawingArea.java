package session07;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
/**
 * @author dkruger
 */
public class DrawingArea extends JPanel {
    private ArrayList<Shape> drawList;
    
    public DrawingArea() {
        drawList = new ArrayList<>();
        drawList.add(new Line(0,0, 300, 200));
        drawList.add(new Rect(100,300, 200, 400));
        addMouseListener(new HandleMouseEvents());
    }
    
    private class HandleMouseEvents extends MouseAdapter {
        private int startX, startY;
        @Override
        public void mousePressed(MouseEvent me) {
            startX = me.getX(); startY = me.getY();
        }

        @Override
        public void mouseReleased(MouseEvent me) {
            Graphics g = getGraphics();
            Shape s = new Line(startX, startY, me.getX(), me.getY());
            drawList.add(s);
            s.draw(g);
        }
    }
    
    
    public void paint(Graphics g) {
        for (Shape s : drawList)
            s.draw(g);
    }
}
