package edu.stevens.s07;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author DovKr
 */
public class S07 {

    public static void main(String[] args) {
        S07 a = new S07(); // concrete class, can instantiate
        
    }
}

abstract class Shape {
  private int x,y;
  protected Shape(int x, int y) {
    this.x = x;
    this.y = y;
  }
  public abstract double area();
}

class Circle extends Shape {
  private int r;
  public Circle(int x, int y, int r) {
    super(x,y);
    this.r = r;
  }
  public double area() {
    return Math.PI  * r * r;
  }
}

// interfaces have no data, no methods, ONLY ABSTRACT METHODS
interface Flier {
  public void fly();
}

class MyListener implements ActionListener {

  @Override
  public void actionPerformed(ActionEvent e) {

  }
   
}




