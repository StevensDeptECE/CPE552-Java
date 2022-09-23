package session07;

/**
 *
 * @author dkruger
 */
public class ClassReview {
  public static void main(String[] args) {
    A a1 = new A();
//  Shape s= new Shape(); // illegal shape is abstract
  }
}

class A {
  int x;
  public A() { x = 0; }
}


// a class containing 1 or more abstract methods is abstract
// an abstract class may not be instantiated
abstract class Shape {
  private double x,y;
  public Shape(double x, double y) { this.x = x; this.y = y; }
  public abstract double area(); // abstract method requires abstract class
}

class Circle extends Shape {
  private double r;
  public Circle(double x, double y, double r) {
    super(x,y);
    this.r = r;
  }
  public double area() { return Math.PI * r * r; }
}
interface C {
  public double area();
  public double perimeter();
}







