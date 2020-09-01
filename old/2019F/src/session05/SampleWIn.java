package session05;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author dkruger
 */
public class SampleWin {
    public static void main(String[] args) {
        JButton b = new JButton("hello");
        b.addActionListener(new MyListener());
        b.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("Hello");
                    }
                }
        
        );
        
    }
    
}
class MyListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("hello");
    }    
}
    
