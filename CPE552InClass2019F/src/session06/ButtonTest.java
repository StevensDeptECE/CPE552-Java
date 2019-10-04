package session06;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 * @author dkruger
 */
public class ButtonTest extends JFrame {
    private JTextField t;
    public ButtonTest() {
      JButton b = new JButton("ok");
      t = new JTextField();
      Container c = getContentPane();
      getContentPane().add(BorderLayout.NORTH, t);
      c.add(BorderLayout.SOUTH, b);
      b.addActionListener(new ActionListener() { // ButtonTest$1
          public void actionPerformed(ActionEvent e) {
             //t.setText(t.getText() + "hello!");
             int count = Integer.parseInt(t.getText());
             t.setText(count + 1 + "")
          }
      } );  
    }
}
