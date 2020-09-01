package session04;

import java.awt.*;
import javax.swing.JFrame;

/**
 *
 * @author dkruger
 */
public class Win3 extends JFrame {
    public Win3(Color fg, Color bg) {
       setSize(600,400);
       Container c = getContentPane();
       c.setBackground(bg);
       c.setForeground(fg);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setVisible(true); 
    }
    public static void main(String[] args) {
        new Win3(Color.BLACK, Color.RED);
        new Win3(Color.WHITE, Color.BLUE);
    }
}
