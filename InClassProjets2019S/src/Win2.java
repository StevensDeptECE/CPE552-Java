import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author dkruger
 */
public class Win2 extends JFrame {
    public Win2(int w, int h, Color bg, Color fg, String title) {
        super();
        setTitle(title);
        setSize(w, h);
        Container c = getContentPane();
        c.setBackground(bg);
        c.setForeground(fg);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        Win2 w = new Win2(1000, 800, Color.RED, Color.BLACK, "test window");
        Win2 w2 = new Win2(1000, 800, Color.BLUE, Color.WHITE, "test window");
        
        
    }
    
}
