package session04;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author dkruger
 */
public class ColorChoose extends JFrame {
    private JScrollBar r, g, b;
    private JPanel colorArea;
    public ColorChoose(int w, int h) {
       setSize(w, h);
       Container c = this.getContentPane();
       c.setLayout(new GridLayout(1, 4));
       r = new JScrollBar(JScrollBar.VERTICAL, 0, 16, 0, 255);
       r.addAdjustmentListener(
         new AdjustmentListener() {
           @Override
           public void adjustmentValueChanged(AdjustmentEvent ae) {
               Color c = new Color(r.getValue(), g.getValue(), b.getValue());
               colorArea.setBackground(c);
               colorArea.repaint();
           }    
         }
       );
       
       g = new JScrollBar(JScrollBar.VERTICAL, 0, 16, 0, 255);
       g.addAdjustmentListener(
         new AdjustmentListener() {
           @Override
           public void adjustmentValueChanged(AdjustmentEvent ae) {
               Color c = new Color(r.getValue(), g.getValue(), b.getValue());
               colorArea.setBackground(c);
               colorArea.repaint();
           }    
         }
       );
       b = new JScrollBar(JScrollBar.VERTICAL, 0, 16, 0, 255);
       b.addAdjustmentListener(
         new AdjustmentListener() {
           @Override
           public void adjustmentValueChanged(AdjustmentEvent ae) {
               Color c = new Color(r.getValue(), g.getValue(), b.getValue());
               colorArea.setBackground(c);
               colorArea.repaint();
           }    
         }
       );

       c.add(r);
       c.add(g);
       c.add(b);
       c.add(colorArea = new JPanel());
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setVisible(true); 
    }
    public static void main(String[] args) {
        new ColorChoose(1000, 800);
    }
}
