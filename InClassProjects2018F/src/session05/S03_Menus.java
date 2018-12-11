package session05;

/**
 *
 * @author dkruger
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class S03_Menus extends JFrame {
    public S03_Menus() {
      super("Test Menus");
      setSize(800,600);
      Container c = getContentPane();
      c.setBackground(Color.BLUE);
      JMenu m = new JMenu("File");
      JMenuItem mi = new JMenuItem("New");
      mi.addActionListener(new MyListener2());
      m.add(mi);
      JMenuBar menubar = new JMenuBar();
      menubar.add(m);
      setJMenuBar(menubar);
      setVisible(true);
    }
    public static void main(String[] args) {
       new S03_Menus(); 
    }
}

class MyListener2 implements ActionListener {
   public void actionPerformed(ActionEvent e) { 
       System.out.println("hello");
   }
}