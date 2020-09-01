import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author dkruger
 */
public class GridButtons extends JFrame {
    public GridButtons() {
        super("Grid Buttons");
        Container c = getContentPane();
        c.setLayout(new GridLayout(2, 1));
        JPanel p1 = new JPanel();
        p1.setBackground(Color.GREEN);
        JTextField t = new JTextField("some text here");
        p1.add(t, BorderLayout.CENTER);
        JPanel p2 = new JPanel();
        p2.setBackground(Color.RED);
        
        
        p2.setLayout(new GridLayout(4, 3, 10, 5));
        for (int i = 0; i < 12; i++) {
            JButton b = new JButton(i + "");
            p2.add(b);
        }
        c.add(p1);
        c.add(p2);
        setSize(800,600);
        setVisible(true);
    }
    public static void main(String[] args) {
        new GridButtons();
    }
}
