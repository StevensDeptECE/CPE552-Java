package edu.stevens.ee552;

/**
 * @author DovKr
 */
public class Square extends Shape {
  private int side;

  public Square(int s) {
    side = s;
  }

  public double getArea() {
    return side * side;
  }

  public String toString() {
    return "I'm a square! " + side + " area=" + getArea();
  }
}
