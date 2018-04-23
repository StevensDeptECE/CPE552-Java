package session11;
import javax.swing.*;
import java.awt.*;

/**
 * @author dkruger
 */
public class MyWin extends JFrame {
    public MyWin() {
        setSize(600,600);
        setVisible(true);
        // start a thread
        
        // generate random numbers
        // java.util.Random
        // generate random points (x1,y1, x2,y2)
    }
    
    public void paint(Graphics g) {
        if (t == null) {
           t = new Thread(...) {
              //g   
        }
        }  
        }
        Graphics2D g2 = (Graphics2D)g;
        g.drawLine(0,0, 200,200);
    }
    public static void main(String[] args) {
       new MyWin(); 
    }
}
