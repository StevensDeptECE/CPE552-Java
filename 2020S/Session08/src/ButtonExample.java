import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author dkruger
 */
public class ButtonExample extends JFrame {
    private JTextField t;
   public ButtonExample() {
       Container c = getContentPane();
       t = new JTextField();
       c.add(t, BorderLayout.NORTH);

       JButton b = new JButton("Ok");
       c.add(b, BorderLayout.WEST);       
       b.addActionListener(new MyListener());


       b = new JButton("test");
       c.add(b, BorderLayout.CENTER);
       b.addActionListener(new MyListener2());

       b = new JButton("cancel");
       c.add(b, BorderLayout.EAST);
       b.addActionListener(
               new ActionListener() { // class ButtonExample$1 extends MyListener
                   public void actionPerformed(ActionEvent e) {
                       t.setText("Cancel");
                   }
               
               }
       );
       setSize(600,400);
       setVisible(true);
   }
   // inner class
   private class MyListener2  implements ActionListener {
       public void actionPerformed(ActionEvent e) {
           t.setText("test");
       }
   }
   public static void main(String[] args) {
       new ButtonExample();
   }
}

class MyListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        System.out.println("hello");
    }
}