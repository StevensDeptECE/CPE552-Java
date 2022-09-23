package edu.stevens.ee552;

/**
 * @author DovKr
 */
public class Rectangle extends Shape {

  private int w, h;

  public Rectangle(int w, int h) {
    this.w = w;
    this.h = h;
  }

  public String toString() {
    return "I'm a rectangle w=" + w + " h=" + h + " area=" + getArea();
  }

  public double getArea() {
    return w * h;
  }
}
