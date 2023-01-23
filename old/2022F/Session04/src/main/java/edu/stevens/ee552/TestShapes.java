package edu.stevens.ee552;

/**
 * @author DovKr
 */
public class TestShapes {
  public static void main(String[] args) {
    Shape[] shapes = new Shape[3];
    shapes[0] = new Circle(100, 200, 50);
    shapes[1] = new Rectangle(30, 20);
    shapes[2] = new Square(40);
    
    double area = 0;
    for (int i = 0; i < shapes.length; i++) {
      double a = shapes[i].getArea();
      System.out.println("area=" + a);
      area += a; //polymorphism
    }
    System.out.println("total=" + area);
  }
}
