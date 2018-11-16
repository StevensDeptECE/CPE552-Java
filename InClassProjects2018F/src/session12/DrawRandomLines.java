package session12;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author dkruger
 */
public class DrawRandomLines extends JPanel implements Runnable {
    public DrawRandomLines(Color bg, Color fg) {
       setBackground(bg);
       setForeground(fg);
       JFrame f = new JFrame();
       Container c = f.getContentPane();
       f.setSize(800,600);
       f.add(this, BorderLayout.CENTER);
       f.setVisible(true);
       Thread t = new Thread(this);
       t.start();
    }
    public void run() {
        Random r = new Random();
        int width = getWidth(), height = getHeight();
        for (;;) {
            Graphics g = getGraphics();
            g.setColor(Color.BLACK);
            int x = r.nextInt(width), y = r.nextInt(height), x2 = r.nextInt(width), y2 = r.nextInt(height);
//            System.out.println(x + "," + y + "," + x2 + "," + y2);
            g.drawLine(x,y,x2,y2);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {}
        }
    }
    public static void main(String []args) {
        DrawRandomLines draw = new DrawRandomLines(Color.RED, Color.BLACK);
        DrawRandomLines draw2 = new DrawRandomLines(Color.BLUE, Color.WHITE);
    }
}
