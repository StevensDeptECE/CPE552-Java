package session11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author dkruger
 */
public class DrawArea extends JPanel {
    private ArrayList<Shape> drawList;
    private Mode drawMode;
            
    public void setMode(Mode m) { drawMode = m; }
    public DrawArea() {
        drawList = new ArrayList<>(1024);
        drawMode = new RectMode();
        setBackground(Color.BLACK);
        setForeground(Color.RED);
        DrawListener drawListen = new DrawListener();
        addMouseListener(drawListen);
        addMouseMotionListener(drawListen);
    }
    public void paint(Graphics g) {
        super.paint(g);
        for (Shape s : drawList)
            s.draw(g);
    }

    /*
    public class ModeButton extends JButton {
        private Mode mode;
        private static ActionListener a = new ActionListener() {
            public void actionPerformed(ActionEvent e) { 
                ModeButton mb = (ModeButton)e.getSource();
                mb.mode.create(x, y, , TOP)
            }
    };
    public ModeButton(Mode m) { 
        mode = m;
        addActionListener(new Action)
    }
    
   */

    private class DrawListener implements MouseListener, MouseMotionListener {
        private Shape s;
        private int clickX, clickY;
        private int lastX, lastY;
        @Override
        public void mouseClicked(MouseEvent e) {}

        @Override
        public void mousePressed(MouseEvent e) {
            clickX = e.getX();
            clickY = e.getY();
            s = drawMode.create(clickX, clickY, 0, 0);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            drawList.add(s);
            repaint();
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }

        @Override
        public void mouseDragged(MouseEvent e) {          
//            System.out.println(e.getX() + "," + e.getY());
            Graphics g = getGraphics();
            g.setXORMode(Color.WHITE);
            s.draw(g); // undraw
            
            s.setSize((lastX = e.getX()) - clickX, (lastY = e.getY()) - clickY);
            s.draw(g);
        }

        @Override
        public void mouseMoved(MouseEvent e) {
        }
        
    }
    public void addCircle(int x, int y, int r) {
        
//        Graphics g = getGraphics();
//        g.drawOval(x, y, 2*r, 2*r);
    }
    public void addRect(int x, int y, int w, int h) {
        drawList.add(new Rect(x, y, w, h));
    }
    public void save(String filename) throws Exception {
        //new GZIPOutputStream(
       ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename));
       oos.writeObject(drawList);
       oos.close();
    }
    public void open(String filename) throws Exception {
        //new GZIPInputStream(
       ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename));
       drawList = (ArrayList<Shape>)ois.readObject();
       ois.close();
    }
}
