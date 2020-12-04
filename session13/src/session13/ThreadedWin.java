package session13;
import java.awt.*;
import javax.swing.*;
import java.util.Random;

/**
 * @author dkruger
 */
public class ThreadedWin extends JFrame { 
  Random r;
  public ThreadedWin() {  
    setSize(1000,800);
    setBackground(Color.BLACK);
    r = new Random();
    setVisible(true);
  }
  
  public void paint(Graphics g) {
    g.setColor(Color.yellow);
    for (;;) {
      g.drawLine(r.nextInt(getWidth()),r.nextInt(getHeight()), r.nextInt(getWidth()),r.nextInt(getHeight()));
    }
  }
  
  public static void main(String[] args) {
    new ThreadedWin();
    
  }
}
