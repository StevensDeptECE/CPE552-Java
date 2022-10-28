package edu.stevens.s06;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
//newer: JavaFX

/**
 *
 * @author DovKr
 */
public class S00Win { // edu.stevens.s06.S00Win
  public static void main(String[] args) {
    Color c = new Color(255, 0, 0);
    JFrame a = new JFrame("My Window");
    a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    a.setSize(1024, 1024);
    a.setVisible(true);
  }
}
