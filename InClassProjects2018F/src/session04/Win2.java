package session04;
import java.awt.Container;
import java.awt.Color;
import javax.swing.*;
/**
 * @author dkruger
 */
public class Win2 extends JFrame {
    public Win2(String title, int w, int h, Color bg) {
       super(title); // calls JFrame(String title)
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       Container c = getContentPane();
       c.setBackground(bg);
       setSize(w,h);
       setVisible(true); 
    }
   
    public static void main(String[] args) {
       new Win2("Test1", 1000, 800, Color.RED);
       new Win2("Test2", 600, 500, Color.BLUE);
        
    }
}
