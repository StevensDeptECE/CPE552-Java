package session11;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author dkruger
 */
public class FancyJButton {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(600,400);
        Container c = f.getContentPane();
        JButton b  = new JButton("<html>\n<body style='background-color: white; width:100%'><h1>test</h1><p>whoa!</p></body></html>");
        c.add(BorderLayout.SOUTH, b);
        f.setVisible(true);
        
        
    }
}
