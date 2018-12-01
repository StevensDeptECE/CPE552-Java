package session13;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author dkruger
 */
public class BeanEditor extends JFrame {
    public BeanEditor(Object obj) {
        super("Bean Editor");
        String[] attributes = buildGettersSetters();
        // build JTextField for each attribute
        Container c = getContentPane();
        JPanel p = new JPanel();
        c.add(p, BorderLayout.CENTER);
        p.setLayout(new GridLayout(2, attributes.length));
        // write your loop here
        //       p.add( ..)
        
        
        setSize(800,600);
        setVisible(true);
    }
    public static  void main(String[] args) {
        new BeanEditor(new JavaBean2());
        
    }
}
