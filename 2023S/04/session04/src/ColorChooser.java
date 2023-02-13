import javax.swing.*;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class ColorChooser extends JFrame {
    private Container c;
    private JPanel p;
    private JScrollBar r;
    private JScrollBar g;
    private JScrollBar b;

    public ColorChooser() {
        c = getContentPane();
        c.setLayout(new GridLayout(1, 4));
        ColorChange cc = new ColorChange();
        r = new JScrollBar(JScrollBar.VERTICAL, 0, 10, 0, 255);
        r.addAdjustmentListener(cc);
        c.add(r);
        g = new JScrollBar(JScrollBar.VERTICAL, 0, 10, 0, 255);
        g.addAdjustmentListener(cc);
        c.add(g);
        b = new JScrollBar(JScrollBar.VERTICAL, 0, 10, 0, 255);
        b.addAdjustmentListener(cc);
        c.add(b);
        c.add(p = new JPanel());
        setVisible(true);
    }
    public static void main(String[] args) {
        new ColorChooser();
    }
    public class ColorChange implements AdjustmentListener {
        @Override public void adjustmentValueChanged(AdjustmentEvent e) {

        }
    }
}
