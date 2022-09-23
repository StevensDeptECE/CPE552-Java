package session05;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * @author dkruger
 */
public class SwingDemo5 extends JFrame {
  private Container c;
  public SwingDemo5() {
    setSize(600,400);
    c = getContentPane();
    c.setBackground(Color.BLACK);
    JButton b = new JButton("Get Redder");
    c.add(BorderLayout.EAST, b);
    b.addActionListener(new MyListener());
    setVisible(true);
  }
  public static void main(String[] args) {
    new SwingDemo5();
  }
  class MyListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      Color bg = c.getBackground();
      int r = bg.getRed()+8;
      int g = bg.getGreen();
      int b = bg.getBlue();
      c.setBackground(new Color(r,g ,b));
    }
  }

}







