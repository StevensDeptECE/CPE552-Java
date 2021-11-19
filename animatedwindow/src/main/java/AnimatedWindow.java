/**
 *
 * @author dkruger
 */
import javax.swing.*;
import java.awt.*;
import java.util.*;

public class AnimatedWindow extends JFrame implements Runnable {
    private Random r;
    public void run() {
        Graphics g = getGraphics();
        g.setColor(Color.RED);
        for (;;) {
            g.drawLine(r.nextInt(800), r.nextInt(800), r.nextInt(800), r.nextInt(800));
            try {
                Thread.sleep(10);
            } catch (Exception e) {}
        }
    }
    
    public AnimatedWindow() {
        super("animated window");
        setSize(800,800);
        r = new Random();
        setVisible(true);
        Thread t = new Thread(this);
        t.start();
    }
    public static void main(String[] args) {
        new AnimatedWindow();
    }
}
