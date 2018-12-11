package session04;

import java.awt.*;
import javax.swing.JFrame;

/**
 *
 * @author dkruger
 */
public class Win {
    public static void main(String[] args) {
      JFrame f = new JFrame();
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Container c = f.getContentPane();
      c.setBackground(Color.RED);
      f.setSize(800,600);
      f.setVisible(true); 
    }
}
