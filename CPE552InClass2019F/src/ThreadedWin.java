import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 *
 * @author dkruger
 */
public class ThreadedWin extends JFrame implements Runnable {
    private Random r;
    public ThreadedWin() {
        super("LOtsolines");
        setSize(800,800);
        setVisible(true);
        r = new Random();
        Thread t = new Thread(this);
        t.start();
    }
    public void run() {
        Graphics g = getGraphics();
        while (true) {
            g.setColor(new Color(r.nextInt(256), r.nextInt(256),r.nextInt(256)));
            g.drawLine(r.nextInt(800), r.nextInt(800), r.nextInt(800), r.nextInt(800));
            try {
                Thread.sleep(10);
            } catch(Exception e) {}
        }
    }
    public static void main(String args[]) {
       ThreadedWin w = new ThreadedWin(); 
       Object obj = new Object();
       synchronized(obj) {
         // obj.wait()
         //obj.notify()
         // see: threadpool
       }
    }
    
}
