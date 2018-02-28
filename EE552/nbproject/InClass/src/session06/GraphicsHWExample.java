/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session06;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Create a window with a File Menu (quit), an edit menu (cut, paste), and Help
 * @author dkruger
 */
public class GraphicsHWExample extends JFrame {
  public GraphicsHWExample() {
    super("CAD Package");
    setSize(600,400);
//    String[][] menus = 
    JMenuBar mb = new JMenuBar();
    setJMenuBar(mb);
    JMenu m = new JMenu("File");
    mb.add(m);
    JMenuItem mi = new JMenuItem("Quit");
    m.add(mi);
    setVisible(true);
  }
  
  public static void main(String[] args) {
    new GraphicsHWExample();
  } 
}
