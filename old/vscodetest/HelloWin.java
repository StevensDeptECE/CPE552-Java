import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HelloWin {
  public static void main(String[] args) {
    JFrame f = new JFrame("test");
    f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    f.setSize(1000,1000);
    Container c = f.getContentPane();
    JButton b = new JButton("test");
    c.add(BorderLayout.CENTER, b);
    //f.setVisible(true);
    int sum = 3;
    for (int i = 0; i < 100; i++)
     for (int j = 0; j < 100; j++)
       sum += i*j;
    System.out.println(sum);
  }
}