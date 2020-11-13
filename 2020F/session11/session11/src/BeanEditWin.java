
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author dkruger
 */
public class BeanEditWin extends JFrame {
  private BeanEditor b;
  private JTextField t;
  public BeanEditWin() {
    super("Bean Editor");
    setSize(1000,800);
    b = new BeanEditor();
    Container c = getContentPane();
    c.add(b, BorderLayout.CENTER);
    t = new JTextField();
    t.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JTextField tf = (JTextField)e.getSource();
        try {
          System.out.println(tf.getText());
          Class c = Class.forName(tf.getText());
          b.setBean(c);
          
        } catch (Exception e2) {
          e2.printStackTrace();
        }
      }
    });
    c.add(t, BorderLayout.NORTH);
   
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
  public static void main(String[] args) {
    new BeanEditWin();
  }
    
  
}
