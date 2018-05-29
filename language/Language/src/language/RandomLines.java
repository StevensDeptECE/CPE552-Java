package language;

/**
 *
 * @author dkruger
 */
import javax.swing.*;
import java.awt.*;
import java.util.*;

public class RandomLines extends JFrame implements Runnable {
    private Thread animator;
    private Random rnd;
    public RandomLines() {
        super("Random Lines");
        animator = null;
        rnd = new Random();
        this.setSize(1024, 1024);
        setVisible(true);
    }
    public void run() {
        while (true) {
            int x = rnd.nextInt(1024);
            int y = rnd.nextInt(1024);
            int x2 = rnd.nextInt(1024);
            int y2 = rnd.nextInt(1024);
            int r = rnd.nextInt(256);
            int g = rnd.nextInt(256);
            int b = rnd.nextInt(256);
            Graphics gr = getGraphics();
            gr.setColor(new Color(r,g,b));
            gr.drawLine(x, y, x2, y2);
        }
    }
    public void paint(Graphics g) {
        if (animator == null) {
            animator = new Thread(this);
            animator.start();
        }

    }
    public static void main(String[]args) {
       RandomLines r = new RandomLines(); 
    }
}
