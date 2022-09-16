package edu.stevens.cpe552.draw;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author dkruger
 */
public class DrawApp extends JFrame {
    private void buildMenus() {
        
    }
    private void buildLayout() {
        setTitle("DrawApp");
        setSize(1000,1000);
        JPanel p = new JPanel();
        p.setBackground(Color.RED);
        p.setLayout(new GridLayout(1, 10));
        JButton b = new JButton("Line");
        p.add(b);
        Container c = getContentPane();
        c.add(p, BorderLayout.NORTH);
        DrawArea da = new DrawArea();
        c.add(da, BorderLayout.CENTER);
    }
    public DrawApp() {
        super();
        buildMenus();
        buildLayout();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new DrawApp();
    }
    
}
