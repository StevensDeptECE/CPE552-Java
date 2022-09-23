package session05;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * @author dkruger
 */
public class SwingDemo6 extends JFrame {
  private Container c;
  private JTextField tf;
  public SwingDemo6() {
    setSize(600,400);
    c = getContentPane();
    c.setBackground(Color.BLACK);
    tf = new JTextField();
    c.add(BorderLayout.NORTH, tf);
    Font f = new Font("Times", Font.PLAIN, 48);
    tf.setFont(f);
    JButton b = new JButton("ok");
    c.add(BorderLayout.SOUTH, b);
    b.addActionListener(new MyListener());
    setVisible(true);
  }
  public static void main(String[] args) {
    new SwingDemo6();
  }
  class MyListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      tf.setText(tf.getText() + "ok");
    }
  }

}







