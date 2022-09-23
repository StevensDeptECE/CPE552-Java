/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session04;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author dkruger
 */
public class SwingDemo1 {
  public static void main(String[] args) {
    JFrame f = new JFrame();
    f.setSize(1000,700);
    JButton b = new JButton("ok");
    b.addActionListener(new MyListener());
    Container c = f.getContentPane();
    c.add(BorderLayout.NORTH, b);
    f.setVisible(true); 
  }
}

class MyListener implements ActionListener {
  public void actionPerformed(ActionEvent e) {
    System.out.println("yo");
  }
}