package languagefeatures;

/**
 *
 * @author dkruger
 */
import java.awt.*;
import javax.swing.*;

public class DrawText extends JComponent {
    public void paint(Graphics g) {
        g.drawString("Testing 123", 0, 30);
    }
    public static void main(String[] args) {
        JFrame f = new JFrame("Testing Text Drawing");
        f.setSize(600,400);
        Container c = f.getContentPane();
        c.add(new DrawText(), BorderLayout.CENTER);
        f.setVisible(true);
    }
}
