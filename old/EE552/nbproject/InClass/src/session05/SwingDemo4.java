package session05;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * @author dkruger
 */
public class SwingDemo4 extends JFrame {
  public SwingDemo4() {
    setSize(600,400);
    Container c = getContentPane();
    JLabel text = new JLabel("yo ho ho and a bottle of rum");
    c.add(BorderLayout.NORTH, text);
    Font f = new Font("Helvetica", Font.BOLD, 32);
    JTextField tf = new JTextField("testing testing");
    tf.setFont(f);
    c.add(BorderLayout.SOUTH, tf);
    JPanel p = new JPanel();
    p.setBackground(Color.RED);
    c.add(BorderLayout.CENTER, p);
    setVisible(true);
  }
  public static void main(String[] args) {
    new SwingDemo4();
  }
}
