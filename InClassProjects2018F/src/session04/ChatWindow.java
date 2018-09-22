package session04;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.*;
/**
 * @author dkruger
 */
public class ChatWindow extends JFrame {
    public ChatWindow(int w, int h, Color bg) {
       super("Stevens Chat"); 
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       Container c = getContentPane();
       c.setBackground(bg);
       setSize(w,h);
       Font f = new Font("Times", Font.PLAIN, 24);
       JButton b = new JButton("ok");
       b.setFont(f);
       c.add(b, BorderLayout.NORTH);
       
       JTextField t = new JTextField("testing testing 123");
       t.setFont(f);
       c.add(t, BorderLayout.SOUTH);
       
       JPanel p = new JPanel();
       p.setBackground(new Color(100, 0, 150));
       p.setLayout(new GridLayout(3, 3, 5, 10));
       String[] names = { "x", "y", "testing", "hello", "大", "a", "b", "c", "d"};
       for (int i = 0; i < 9; i++) {
          b = new JButton(names[i]);
          p.add(b);
           
       }
       c.add(p, BorderLayout.CENTER);
       
       
       setVisible(true); 
    }
   
    public static void main(String[] args) {
       new ChatWindow(800, 600, Color.RED);
        
    }
}
