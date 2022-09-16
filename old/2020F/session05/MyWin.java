import java.awt.*;
import javax.swing.*;
import java.util.*;

public class MyWin extends JFrame implements Runnable {
    private Random rnd;
    public MyWin() {
        super("Animation Window");
        rnd = new Random();
        setSize(800,500);
        setVisible(true);
    }

    public void run() {
        for (;;) {
            Graphics g = getGraphics();
            for (int i = 0; i < 10; i++)
                g.drawLine(rnd.nextInt(800), rnd.nextInt(500), rnd.nextInt(800), rnd.nextInt(500));
            try {
                Thread.sleep(10);
            } catch(InterruptedException e) {}
        }
    }
    public static void main(String[] args) {
        MyWin w = new MyWin();
        Thread t = new Thread(w);
        t.start();

    }
}