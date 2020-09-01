package session05;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 * @author dkruger
 */
public class ListenerTest {
    public static void main(String[] args) {
        JButton b = new JButton("ok");
        b.addActionListener( new MyListener()  );
    }
}

class MyListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      System.out.println("test");  
    }
}