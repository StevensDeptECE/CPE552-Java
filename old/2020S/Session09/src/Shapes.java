import static java.lang.Math.*;
import java.util.*;

abstract class Shape {
    public abstract double area();    
}
class Rect extends Shape {
    private double L, W;
    public Rect(double L, double W) {
        this.L = L; this.W = W;
    }
    public double area() { return L*W; }
}

class Circle extends Shape {
    private double r;
    public Circle(double r) { this.r = r ;}
    public double area() {
        return PI * r * r;
    }
}

public class Shapes {
   public static void main(String[] args) {
       Shape[] shapes = new Shape[2];
       shapes[0] = new Rect(3,4);
       shapes[1] = new Circle(2.3);
       
       for (int i = 0; i < shapes.length; i++)
           System.out.println(shapes[i].area());
       for (Shape s : shapes)
           System.out.println(s.area());
       
       ArrayList<Shape> list = new ArrayList<>();
       list.add(new Rect(3,4));
       list.add(new Rect(4,4));
       list.add(new Circle(3.2));
       
       for (int i = 0; i < list.size(); i++) {
          System.out.println(list.get(i).area());
       }
       for (Shape s : list) {
          System.out.println(s.area());
       }
       for (Iterator<Shape> i = list.iterator(); i.hasNext(); ) {
          Shape s = i.next();
          System.out.println(s.area());
       }
   }  
}