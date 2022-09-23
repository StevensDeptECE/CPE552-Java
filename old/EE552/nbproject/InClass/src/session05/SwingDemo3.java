package session05;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * @author dkruger
 */
public class SwingDemo3 extends JFrame {
  public SwingDemo3() {
    setSize(600,400);
    setLayout(new GridLayout(3, 3, 5, 10));
    Container c = getContentPane();
    for (int i = 1; i <= 9; i++) {
        JButton b = new JButton(i+"");
        c.add(b);
    }
    setVisible(true);
  }
  public static void main(String[] args) {
    new SwingDemo3();
  }
}
