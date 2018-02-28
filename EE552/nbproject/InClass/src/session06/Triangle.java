package session06;

/**
 * @author dkruger
 */
public class Triangle extends Shape2D {
  private int x2,y2, x3,y3;
  public Triangle(int x1,int y1, int x2, int y2, int x3, int y3) {
    super(x1,y1);
    this.x2 = x2; this.y2 = y2;
    this.x3 = x3; this.y3 = y3;
  }
  public double area() {
    throw new RuntimeException("Not Implemented");
  }
}







