import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

// public interface ActionListener {
//   public void actionPerformed(ActionEvent e);
//}
/**
 *
 * @author dkruger
 */
public class DrawLines extends JFrame implements Runnable {
  private Random r;
  private Thread t;
  public DrawLines() {
    super();
//can only be called once        super("Draw Lines");
    setSize(800,800);
    JMenuBar mb = new JMenuBar();
    JMenu m = new JMenu("File");
    mb.add(m);
    JMenuItem mi = new JMenuItem("Quit");
    mi.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.exit(0);
      }
    });
    m.add(mi);
    setJMenuBar(mb);
    r = new Random();
    setVisible(true); 
  }
 
  
  public void run() {
    Graphics g = getGraphics();
      for (;;) {
        int x1 = r.nextInt(getWidth()), y1 = r.nextInt(getHeight());
        int x2 = r.nextInt(getWidth()), y2 = r.nextInt(getHeight());
        g.drawLine(x1, y1, x2, y2);
 
        try {
         Thread.sleep(100);
        } catch (InterruptedException ex) {
          Logger.getLogger(DrawLines.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
  }
  public void paint(Graphics g) {
    super.paint(g);
    if (t == null) {
      t = new Thread(this);
      t.start();
    }
  }
  public static void main(String[] args) {
    new DrawLines();
  }
}
