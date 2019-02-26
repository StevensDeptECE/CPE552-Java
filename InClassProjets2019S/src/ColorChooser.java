import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author dkruger
 */
public class ColorChooser extends Win2 {
    private JScrollBar r, g, b;
    private JPanel p;
    public ColorChooser() {
       super(600,400, Color.BLACK, Color.WHITE, "Color chooser");
       Container c = getContentPane();
       c.setLayout(new GridLayout(1, 4));
       r = new JScrollBar(JScrollBar.VERTICAL, 0, 16, 0, 255);
       g = new JScrollBar(JScrollBar.VERTICAL, 0, 16, 0, 255);
       b = new JScrollBar(JScrollBar.VERTICAL, 0, 16, 0, 255);
       ColorListener cl = new ColorListener();
       r.addAdjustmentListener(cl);
       g.addAdjustmentListener(cl);
       b.addAdjustmentListener(cl);
       p = new JPanel();
       c.add(r);
       c.add(g);
       c.add(b);
       c.add(p);
       setVisible(true);
    }
    public static void main(String[] args) {
        new ColorChooser();
    }
    /* ColorListener is an Inner class and has access to all the private variables of the outer
    */
    class ColorListener implements AdjustmentListener {
        @Override
        public void adjustmentValueChanged(AdjustmentEvent ae) {
             p.setBackground(new Color(r.getValue(), g.getValue(), b.getValue()));
             p.repaint();
        }
        
    }

}
