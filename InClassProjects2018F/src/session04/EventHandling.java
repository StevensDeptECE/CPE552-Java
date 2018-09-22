package session04;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author dkruger
 */
public class EventHandling extends JFrame {
    private JTextArea messages;
    private JTextField t;
    public EventHandling() {
       super("test events");
       setSize(800,600);
       Container c = getContentPane();
       JButton b = new JButton("grow");
       t = new JTextField();
       t.addActionListener(new MyTFListener());
       c.add(b, BorderLayout.EAST);
       c.add(t, BorderLayout.SOUTH);
       messages = new JTextArea();
       c.add(messages, BorderLayout.CENTER);
       MyButtonListener a = new MyButtonListener();
       b.addActionListener(a);
       setVisible(true);
    }
    
    class MyButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("hello");
            int w = getWidth();
            int h = getHeight();
            setSize(w+100, h);
        }
    }

    class MyTFListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
           String s = t.getText();
           messages.setText(messages.getText() + s);
        }
    }
    
    public static void main(String[] args) {
       new EventHandling(); 
    }
}

    
    
}

