import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


/**
 * @author dkruger
 * 
 * Represents and Analog clock on the screen
 */
public class Clock extends JPanel {
    private float bigHand;
    private float bigHandAngle;
    public Clock() {
        bigHand = 300;
        bigHandAngle = 0;
        Thread t = new Thread() {
           public void run() {
               while(true) {
                   try {
                       Clock.this.repaint();
                       //System.out.println("hello");
                       Thread.sleep(1000);
                   } catch (InterruptedException ex) {
                   }    
               }
           }
        };
        t.start();
    }
    
    public void paint(Graphics g) {
        int w = getWidth();
        g.drawOval(0, 0, w, w);
        int x = (int)(w/2 + bigHand * Math.cos(bigHandAngle));
        int y = (int)(w/2 + bigHand * Math.sin(bigHandAngle));
        g.drawLine(w/2, w/2, x, y);
        bigHandAngle += 0.01;
    }
}
