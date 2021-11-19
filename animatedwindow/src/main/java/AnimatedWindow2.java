/**
 *
 * @author dkruger
 */
import javax.swing.*;
import java.awt.*;
import java.util.*;

public class AnimatedWindow2 extends JFrame {
    private Random r;
    
    public AnimatedWindow2() {
        super("animated window");
        setSize(800,800);
        r = new Random();
        setVisible(true);
        Graphics g = getGraphics();
        Thread t = new Thread(new RandomWalk(r, g, Color.RED));
        t.start();
        Thread t2 = new Thread(new RandomWalk(r, g, Color.blue));
        t2.start();
    }
    public static void main(String[] args) {
        new AnimatedWindow2();
    }
}

class RandomWalk implements Runnable {
    private Graphics g;
    private Color c;
    private Random r;
    public RandomWalk(Random r, Graphics g, Color c) {
        this.r = r;
        this.g = g;
        this.c = c;
    }
    
     public void run() {
        for (;;) {
            g.setColor(c);
            g.drawLine(r.nextInt(800), r.nextInt(800), r.nextInt(800), r.nextInt(800));
            try {
                Thread.sleep(10);
            } catch (Exception e) {}
        }
    }
   
}