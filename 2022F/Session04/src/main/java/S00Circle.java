
/**
 * @author DovKr
 */
class Circle {

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
}

public class S00Circle {

  public static void main(String[] args) {
    Circle c = new Circle(100, 150, 25); //x,y,r
    int r = c.getRadius();
    System.out.println(r);
    System.out.println(c.getArea());
  }
}
