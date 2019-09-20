package session04;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * @author dkruger
 */
public class MenuWin extends JFrame {
    public MenuWin() {
        super("Rebuild Menu");
        buildMenu("start");
        JButton b = new JButton("rebuild menu");
        b.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) { 
               buildMenu("testing");
           }
        });
        getContentPane().add(BorderLayout.CENTER, b);
        setSize(600,400);
        setVisible(true);
    }
    
    public void buildMenu(String text) {
        JMenuBar mb = new JMenuBar();
        JMenu m = new JMenu(text);
        mb.add(m);
        setJMenuBar(mb);
    }
    
    public static void main(String[] args) {
       new MenuWin(); 
    }
}
