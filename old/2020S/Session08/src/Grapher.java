import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author dkruger
 */
public class Grapher extends JFrame {
    public Grapher() {
       super("Grapher");
       Container c = getContentPane();
       c.add(new Graph(), BorderLayout.CENTER);
       addWindowListener(
       new WindowListener() {
           @Override
           public void windowOpened(WindowEvent arg0) {
           }

           @Override
           public void windowClosing(WindowEvent arg0) {
               System.exit(0);
           }

           @Override
           public void windowClosed(WindowEvent arg0) {
           }

           @Override
           public void windowIconified(WindowEvent arg0) {
           }

           @Override
           public void windowDeiconified(WindowEvent arg0) {
           }

           @Override
           public void windowActivated(WindowEvent arg0) {
           }

           @Override
           public void windowDeactivated(WindowEvent arg0) {
           }
       }
       
       
       );
       setSize(600,400);
       setVisible(true);
    }
    public static void main(String[] args) {
        new Grapher();
    }
}

class Graph extends JPanel {
    public Graph() {
    }
    public void paint(Graphics g) {
        g.drawLine(0, 0, 200, 200);
    }
}