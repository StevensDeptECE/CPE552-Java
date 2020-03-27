import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author dkruger
 */
public class ColorChooser4 extends JFrame {
    private JScrollBar r,g,b;
    private JPanel p;
    private final JScrollBar createScrollBar(Container c, AdjustmentListener a) {
        JScrollBar b = new JScrollBar(JScrollBar.VERTICAL, 0, 0, 0, 255);
        c.add(b);
        b.addAdjustmentListener(a);
        return b;        
    }
    public ColorChooser4() {
        setLayout(new GridLayout(1,4, 5, 5));
        Container c = getContentPane();
        MyAdjListener a = new MyAdjListener(this);
        r = createScrollBar(c, a);
        g = createScrollBar(c, a);
        b = createScrollBar(c, a);
        p = new JPanel();
        c.add(p);
        addWindowListener( new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setSize(600,400);
        setVisible(true);
    }
    public static void main(String[] args) {
        new ColorChooser2();
    }

    static class MyAdjListener implements AdjustmentListener {
        private ColorChooser4 cc;
        public MyAdjListener(ColorChooser4 cc) {
           this.cc = cc; 
        }
        public void adjustmentValueChanged(AdjustmentEvent e) {
            cc.p.setBackground(new Color(cc.r.getValue(), cc.g.getValue(), cc.b.getValue()));
        }
    }    

    
}
