import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author dkruger
 */
public class Win5 extends Win2 {
    public Win5(int w, int h, Color bg, Color fg, String title) {
        super(w, h, bg, fg, title);
        Container c = getContentPane();
        JButton b = new JButton("ok");
        c.add(BorderLayout.CENTER,b);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               System.out.println("ok");
            }            
        });
       
      
    }
    public static void main(String[] args) {
        Win5 w = new Win5(1000, 800, Color.RED, Color.BLACK, "test window");        
    }
}
