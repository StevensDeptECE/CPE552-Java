
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author dkruger
 */
public class ColorChooser extends JFrame {
    private JScrollBar r,g,b;
    private JPanel p; 
    public ColorChooser() {
        setLayout(new GridLayout(1,4, 5, 5));
        Container c = getContentPane();
        r = new JScrollBar(JScrollBar.VERTICAL, 0, 0, 0, 255);
        c.add(r);
        r.addAdjustmentListener(
            new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent e) {
                p.setBackground(new Color(r.getValue(), g.getValue(), b.getValue()));
            }
        }
        );
        g = new JScrollBar(JScrollBar.VERTICAL, 0, 0, 0, 255);
        g.addAdjustmentListener(
            new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent e) {
                p.setBackground(new Color(r.getValue(), g.getValue(), b.getValue()));
            }
        }
        );
        c.add(g);
        b = new JScrollBar(JScrollBar.VERTICAL, 0, 0, 0, 255);
        b.addAdjustmentListener(
            new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent e) {
                p.setBackground(new Color(r.getValue(), g.getValue(), b.getValue()));
            }
        }
        );

        c.add(b);
        p = new JPanel();
        c.add(p);
        addWindowListener( new WindowAdapter() {
            public void wIndowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setSize(600,400);
        setVisible(true);
    }
    public static void main(String[] args) {
        new ColorChooser();
    }
    
}
