package edu.stevens.s06;
import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import java.awt.Color;
//import java.awt.Container;
//import java.awt.Font;
//import java.awt.GridLayout;

public class S03ButtonLayout extends JFrame {
  public S03ButtonLayout(Color bg, Color fg, int w, int h) {
    super("S03 Button Layout");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(w, h);
    Container c = getContentPane();
    JPanel p = new JPanel();
    c.add(p, BorderLayout.WEST);
    Font f = new Font("Helvetica", Font.BOLD, 25);
    p.setBackground(Color.BLUE);
    String[][] buttonNames = {
      {"test", "yoho"},
      {"a", "b"},
      {"1", "2"}
    };
    p.setLayout(new GridLayout(3,2, 5, 10));
    for (int r = 0; r < 3; r++) {
      for (int col = 0; col < 2; col++) {
        JButton b = new JButton(buttonNames[r][col]);
        b.addActionListener(new MyActionListener());
        b.setFont(f);
        p.add(b);
      }
      
    }
    c.setBackground(bg);
    c.setForeground(fg);
    JTextField t = new JTextField("Testing testing123");
    c.add(t, BorderLayout.SOUTH);
    JLabel t2 = new JLabel("testing");
    c.add(t2, BorderLayout.EAST);
    
    
    setVisible(true);  
  }
  public static void main(String[] args) {
    S03ButtonLayout w = new S03ButtonLayout(Color.RED, Color.BLACK, 900, 500);
  }
}

class MyActionListener implements ActionListener {

  @Override
  public void actionPerformed(ActionEvent e) {
    JButton b = (JButton)e.getSource();
    
    System.out.println(b.getText());    
  }
}