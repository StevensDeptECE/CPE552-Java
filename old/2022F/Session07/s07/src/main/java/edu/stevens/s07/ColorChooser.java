package edu.stevens.s07;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * @author DovKr
 */
public class ColorChooser extends JFrame {
  private JScrollBar r, g, b;
  private JPanel p;
  private JScrollBar addScrollBar(Container c, MyListener m) {
    JScrollBar sb = new JScrollBar(JScrollBar.VERTICAL, 0, 5, 0, 255);
    sb.addAdjustmentListener(m );
    c.add(sb);
    return sb;
  }
  public ColorChooser() {
    Container c = getContentPane();
    c.setLayout(new GridLayout(1, 4, 5, 0));
    MyListener m = new MyListener();
    r = addScrollBar(c, m);
    g = addScrollBar(c, m);
    b = addScrollBar(c, m);
    p = new JPanel();
    c.add(p);
    setSize(800,600);
    // anonymous inner class
    addWindowListener(new WindowAdapter() { // ColorChooser$1
      @Override
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
    setVisible(true);
  }
  public static void main(String[] args) {
    new ColorChooser();
  }

  // inner class
class MyListener implements AdjustmentListener { // ColorChooser$MyListener
  @Override
  public void adjustmentValueChanged(AdjustmentEvent e) {
    //System.out.println(r.getValue());
    p.setBackground(new Color(r.getValue(), g.getValue(), b.getValue()));
  }
 
}


}

