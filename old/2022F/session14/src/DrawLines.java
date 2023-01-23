import java.awt.*;
import javax.swing.*;
import java.util.Random;
public class DrawLines extends JFrame implements Runnable {
    private Random rnd;
    public DrawLines() {
        super("drawing lots of lines");
        rnd = new Random();
        setSize(800,800);
        setVisible(true);
    }
    public void run() {
        for (;;) {
            Graphics g = getGraphics();
            int w = getWidth();
            int x1 = rnd.nextInt(w);
            int y1 = rnd.nextInt(w);
            int x2 = rnd.nextInt(w);
            int y2 = rnd.nextInt(w);

            g.drawLine(x1, y1, x2, y2);
        }
    }
    public static void main(String[] args) {
        DrawLines d = new DrawLines();
        Thread t = new Thread(d);
        t.start();
    }
}
