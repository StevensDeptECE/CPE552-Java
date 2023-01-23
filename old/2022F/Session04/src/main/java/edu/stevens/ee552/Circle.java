package edu.stevens.ee552;

/**
 * @author DovKr
 */
public class Circle extends Shape{

  private int x, y, r;

  public Circle(int x, int y, int r) {
    this.x = x;
    this.y = y;
    this.r = r;
  }

  public int getRadius() {
    return r; // implies this.r
  }
  public double getArea() {
    return Math.PI * r*r;
  }
  public String toString() {
    return "I am a circle! radius=" + r + " area=" + getArea();
  }
}
