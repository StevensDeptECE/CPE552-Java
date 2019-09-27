package session04;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author dkruger
 */
public class Win5 extends JFrame {
    /**
     * Create a window
     * @param fg Foreground color
     * @param bg Background color
     * @param w  width of the window
     * @param h  height of the window
     */
    public Win5(Color fg, Color bg, int w, int h) {
       setSize(w, h);
       Container c = this.getContentPane();
       c.setBackground(bg);
       c.setForeground(fg);
       JButton b = new JButton("testing");
       //Win5$1
       b.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) { 
              System.out.println("hello");
          }
       });
       
       c.add(BorderLayout.WEST, b);
       JPanel p = new JPanel();
       p.setBackground(new Color(205,0,150));
       p.setLayout(new GridLayout(4,4, 5, 10));
       String[] labels = {
           "1", "2", "3", "+", 
           "4", "5", "6", "-"
       };
       for (int i = 0; i < 8; i++) {
           b = new JButton(labels[i]);
           p.add(b);
       }
       JPanel p2 = new JPanel();
       p2.setLayout(new GridLayout(2, 1));
       p2.add(p);
       JTextArea ta = new JTextArea();
       Font f = new Font("Times", Font.BOLD, 124);
       ta.setFont(f);
       p2.add(ta);
       c.add(BorderLayout.CENTER, p2);
       JTextField t = new JTextField();
       t.setBackground(Color.BLACK);
       t.setForeground(Color.GREEN);
       t.setFont(f);
       c.add(BorderLayout.NORTH, t);
       
       
       
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setVisible(true); 
    }
    public static void main(String[] args) {
        new Win5(Color.BLACK, Color.RED, 1000, 800);
    }
}
