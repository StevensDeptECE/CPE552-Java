import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author dkruger
 */
public class Widget extends JFrame {
    public Widget() {
        super("example");
        setSize(1000,600);
        
        Container c = getContentPane();
        Clock clock = new Clock();
        c.add(new Clock(), BorderLayout.CENTER);
//        Speedometer speed = new Speedometer();
        JButton quit = new JButton("quit");
        c.add(quit, BorderLayout.EAST);
        quit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               System.exit(0);
            }
            
        });
        setVisible(true);
    }
    public static void main(String[] args) {
        Widget w = new Widget();         
    }
}
