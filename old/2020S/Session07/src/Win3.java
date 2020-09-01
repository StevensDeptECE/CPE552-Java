import java.awt.*;
import javax.swing.*;
/**
 *
 * @author dkruger
 */
public class Win3 extends JFrame {
    public Win3(Color bg, int w, int h) {
        super("My Window"); // super must be the first line of constructor
        this.setSize(w,h);
        Container c = getContentPane();
        c.setBackground(bg);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Win3(new Color(255,0,0), 800, 600);
        new Win3(new Color(0,0,255), 600, 400);
    }
}
