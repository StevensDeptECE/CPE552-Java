
package language;

/**
 *
 * @author dkruger
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ListenersThreeWays extends JFrame {
    class Inner implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getContentPane().setBackground(Color.red);
        }
    }
    
    public ListenersThreeWays() {
        super("Listeners");
        Container c = getContentPane();
        JButton b;
        
        b = new JButton("test");
        b.addActionListener(new MyListener());
        
        
        c.add(b, BorderLayout.WEST);
        c.add(b = new JButton("yo!"), BorderLayout.EAST);
        b.addActionListener( new ActionListener() { 
            public void actionPerformed(ActionEvent e) {
                System.out.println("Summer");
            }
        }
        );
        
                
        
        c.add(b = new JButton("what"), BorderLayout.SOUTH);
        b.addActionListener(new Inner());
        setSize(1000,600);
        
        setVisible(true);
    }
    public static void main(String[] args) {
        new ListenersThreeWays();
    }
}

class MyListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("hello");
    }
   
}