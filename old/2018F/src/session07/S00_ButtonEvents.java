package session07;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 *
 * @author dkruger
 */
public class S00_ButtonEvents extends JFrame { // session07.S00_ButtonEvents
    public S00_ButtonEvents() {
        super("My window");
        Container c = getContentPane();
        JButton b = new JButton("ok");
        c.add(b, BorderLayout.EAST);
        b.addActionListener(new Inner());
        b = new JButton("bye");
        c.add(b, BorderLayout.WEST);
        b.addActionListener(new ActionListener() { // session07.S00_ButtonEvents$1
           public void actionPerformed(ActionEvent e) { 
               getContentPane().setBackground(Color.blue);
           }
        });
        setSize(600,400);
        setVisible(true);
    }
    class Inner implements ActionListener { // S00_ButtonEvents$Inner
	public void actionPerformed(ActionEvent e) {
            getContentPane().setBackground(Color.red);
	}
    }
    public static void main(String[] args) {
        new S00_ButtonEvents();
    }
}
