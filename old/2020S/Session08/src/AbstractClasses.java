/**
 *
 * @author dkruger
 */
public class AbstractClasses {
    public static void main(String[] args) {
       Circle c1 = new Circle(20);
       System.out.println(c1.area());
       Rectangle r1 = new Rectangle(3,4);
       System.out.println(r1.area());
       Shape s = new Shape();
//       System.out.println(s.area());

    }
}

abstract class Shape {
    public abstract double area();
}

class Rectangle extends Shape {
    private double L, W;
    public Rectangle(double L, double W) { this.L = L; this.W = W; }    
    public double area() { return L * W; }
}

class Circle extends Shape {
    private double r;
    public Circle(double r) { this.r = r; }
    public double area() { return Math.PI * r*r; }    
}

