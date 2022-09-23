package session06;

/**
 *
 * @author dkruger
 */
// this class is IMMUTABLE
public class Circle extends Shape2D {
  public int r;
  public Circle(int x, int y, int r) {
    super(x,y);
    this.r = r;
  }
  public String toString() {
    return super.toString() + ", r=" + r;
  }
  public int getR() { return r; }
  public double area() { return Math.PI * r * r; }
}
