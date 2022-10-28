package edu.stevens.s06;
import javax.swing.*;
import java.awt.Color;
import java.awt.Container;


public class S01Win extends JFrame {
  public S01Win(Color bg, Color fg, int w, int h) {
    super("S01Win");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(w, h);
    Container c = getContentPane();
    c.setBackground(bg);
    c.setForeground(fg);
    setVisible(true);  
  }
  public static void main(String[] args) {
    S01Win w = new S01Win(Color.RED, Color.BLACK, 500, 400);
    S01Win w2 = new S01Win(Color.BLUE, Color.WHITE, 300, 200);
  }
}
