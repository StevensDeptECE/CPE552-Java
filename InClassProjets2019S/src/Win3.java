import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author dkruger
 */
public class Win3 extends Win2 {
    public Win3(int w, int h, Color bg, Color fg, String title) {
        super(w, h, bg, fg, title);
        Container c = getContentPane();
        JButton b = new JButton("ok");
        b.addActionListener(new MyActionListener());
        c.add(BorderLayout.WEST, b);
        JPanel p = new JPanel();
        p.setBackground(Color.BLUE);
        p.setLayout(new GridLayout(3,3, 5, 5));
        for (int i = 1; i <= 9; i++) {
            JButton b2 = new JButton(i+"");
            p.add(b2);
        }
        c.add(BorderLayout.CENTER, p);
    }
    public static void main(String[] args) {
        Win3 w = new Win3(1000, 800, Color.RED, Color.BLACK, "test window");        
    }
}
/*public interface ActionListener {
    public void actionPerformed(ActionEvent e);
}
*/

class MyActionListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        System.out.println("hello");
    }
}