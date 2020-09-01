package session07;

/**
 * @author dkruger
 */
import javax.swing.*;
import java.awt.event.*;
public class S01_Events extends JFrame {
    public S01_Events() {
        super("Window Events");
        setSize(800,600);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
/*        addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

            @Override
            public void windowClosed(WindowEvent e) {
            }

            @Override
            public void windowIconified(WindowEvent e) {
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
            }

            @Override
            public void windowActivated(WindowEvent e) {
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
            }
            
        });
*/
        setVisible(true);
    }
    
    public static  void main(String[] args) {
        new S01_Events();
    }
}
