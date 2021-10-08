import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * @author dkruger
 */
public class DialogExample extends JFrame {
    public DialogExample() {
        super("example");
        setSize(1000,600);
        JButton b = new JButton("color");
        b.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
              JColorChooser c = new JColorChooser();
              c.setSize(600,600);
              c.setVisible(true);
          }
        });
        Container c = getContentPane();
        c.add(b, BorderLayout.EAST);
        setVisible(true);
    }
    public static void main(String[] args) {
        DialogExample e = new DialogExample(); 
        
    }
}
