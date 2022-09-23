package session06;

/**
 *
 * @author dkruger
 */
public class GeometryTest {
  public static void main(String[] args) {
    int x = 100, y = 150, r = 50;
    Circle c = new Circle(x,y,r);
    // error : no matching constructor Circle c2 = new Circle();
    System.out.println(c);
    System.out.println(c.getX());
    System.out.println(c.getY());
    System.out.println(c.getR());
    System.out.println(c.area());
    x = 300; y = 350;
    final int L = 100, W = 200;
    Rect rect = new Rect(x, y, L, W);
    System.out.println(rect.area());
    System.out.println(rect.getX());
    System.out.println(rect.getY());
    System.out.println(rect.getW());
    System.out.println(rect.getH());
    Triangle t = new Triangle(0,0, 100,200, 50, 400);
    System.out.println(t);
    
    Shape2D[] list = new Shape2D[3];
    list[0] = rect;
    list[1] = c;
    list[2] = t;
    for (int i = 0; i < list.length; i++)
      System.out.print(list[i] + ": " + list[i].area());
  }
}
