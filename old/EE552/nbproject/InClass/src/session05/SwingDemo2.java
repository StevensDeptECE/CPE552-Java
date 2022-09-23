package session05;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author dkruger
 */
public class SwingDemo2 extends JFrame {
  public SwingDemo2(String title, Color bg, int w, int h) {
    this.setSize(w,h);
    JButton b = new JButton("ok");
    b.addActionListener(new MyListener());
    Container c = this.getContentPane();
    c.setBackground(bg);
    c.add(BorderLayout.NORTH, b);
    JButton b2 = new JButton("test");
    c.add(BorderLayout.EAST, b2);
    this.setVisible(true);  
  }
  
  public static void main(String[] args) {
    new SwingDemo2("Test1", Color.BLUE, 800,600);
    new SwingDemo2("Test2", Color.RED, 400,200);
  }

class MyListener implements ActionListener {
  public void actionPerformed(ActionEvent e) {
    System.out.println("yo");
  }
}







