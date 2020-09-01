import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author dkruger
 */
public class Win4 extends Win2 {
    public Win4(int w, int h, Color bg, Color fg, String title) {
        super(w, h, bg, fg, title);
        Container c = getContentPane();
        JButton b = new JButton("ok");
        c.add(BorderLayout.CENTER,b);

        ActionListener al = new ActionListener() { // Win4$1
            public void actionPerformed(ActionEvent e) {
               System.out.println("ok");
            }
        };
        b.addActionListener(al);
       
      
    }
    public static void main(String[] args) {
        Win4 w = new Win4(1000, 800, Color.RED, Color.BLACK, "test window");        
    }
}
