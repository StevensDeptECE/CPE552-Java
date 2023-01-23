
/**
 * @author DovKr
 */
class Square {

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

class Rectangle {

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

public class S01Shapes {

  public static void main(String[] args) {
    Square s = new Square(10); // side=10
    Rectangle r = new Rectangle(3, 4); // w=3, h=4
    Circle c = new Circle(100, 500, 50);
    System.out.println(s);
    System.out.println(r);
    System.out.println(c);

    int[] a = new int[10];
    for (int i = 0; i < a.length; i++) {
      a[i] = i;
    }

    Circle[] circles = new Circle[10];
    // circles[0]  = null
    // circles[1] = null
    //circles[9] = null

    for (int i = 0; i < circles.length; i++) {
      circles[i] = new Circle(100, 200, 5 * i);
    }
    Rectangle[] rectangles = new Rectangle[20];
    for (int i = 0; i < rectangles.length; i++)
      rectangles[i] = new Rectangle(3, 4);

  }
}
