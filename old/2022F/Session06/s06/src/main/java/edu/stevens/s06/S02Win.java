package edu.stevens.s06;
import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.Color;
import java.awt.Container;

/*
  S01Win is a concrete class because you can make one
  "making one" = instantiate one
  opposite of an abstract class is a concrete class
*/

public class S02Win extends JFrame {
  public S02Win(Color bg, Color fg, int w, int h) {
    super("S02Win");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(w, h);
    Container c = getContentPane();
    c.add(new JButton("ok"), BorderLayout.NORTH);
    c.add(new JButton("hello"), BorderLayout.SOUTH);
    c.setBackground(bg);
    c.setForeground(fg);
    setVisible(true);  
  }
  public static void main(String[] args) {
    S02Win w = new S02Win(Color.RED, Color.BLACK, 500, 400);
  }
}
