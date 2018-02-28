/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session06;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author dkruger
 */
public class WindowThatCanClose extends JFrame {
  public WindowThatCanClose() {
    setSize(800,400);
    Container c = getContentPane();
    JButton b = new JButton("ok");
    c.add(BorderLayout.CENTER, b);
    addWindowListener(new MyWindowListener());
    b.addActionListener( new MyListener() );
    setVisible(true);
  }
  public static void main(String[] args) {
    new WindowThatCanClose();
  }  
}

class MyListener implements ActionListener {
  @Override
  public void actionPerformed(ActionEvent e) {
    System.out.println("yo");
  }
}

class MyWindowListener implements WindowListener {

  @Override
  public void windowOpened(WindowEvent e) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public void windowClosing(WindowEvent e) {
    System.exit(0);
  }

  @Override
  public void windowClosed(WindowEvent e) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public void windowIconified(WindowEvent e) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
 
 @Override
  public void windowDeiconified(WindowEvent e) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public void windowActivated(WindowEvent e) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public void windowDeactivated(WindowEvent e) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }
  
}












