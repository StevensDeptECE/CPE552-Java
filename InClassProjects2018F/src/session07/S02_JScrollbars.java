package session07;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author dkruger
 */
public class S02_JScrollbars extends JFrame {
    private JPanel p;
    private JScrollBar r, g, b;
    public S02_JScrollbars() {
        super("Color Chooser");
        setSize(700,500);
        setLayout(new GridLayout(1, 4, 5, 5));
        Container c = getContentPane();
        c.add(r = new JScrollBar(JScrollBar.VERTICAL, 0,10, 0, 255));
        AdjustmentListener a = new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                p.setBackground(new Color(r.getValue(), g.getValue(), b.getValue())    );
            }
        };
        r.addAdjustmentListener(a); 
        c.add(g = new JScrollBar(JScrollBar.VERTICAL, 0,10, 0, 255));
        g.addAdjustmentListener( a);
        c.add(b = new JScrollBar(JScrollBar.VERTICAL, 0,10, 0, 255));
        b.addAdjustmentListener( a);
        c.add(p = new JPanel());
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setVisible(true);
    }
    public static void main(String[] args) {
        new S02_JScrollbars();
    }
}
