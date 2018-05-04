package language;

/**
 *
 * @author dkruger
 */
public class Polymorphism {
    public static void main(String[] args) {
      Rect r = new Rect(10,20, 50,50);
      System.out.println(r.area());
      
      Circle c = new Circle(40,20, 25);
      System.out.println(c.area());
      
      Shape[] shapes = new Shape[2];
      shapes[0] = c;
      shapes[1] = r;
      
      for (int i = 0; i < shapes.length; i++)
          shapes[i].area();
      
      ((Rect)shapes[1]).f();
      
      
        
    }
}


abstract class Shape {
    protected int x,y;
    
    public Shape(int x, int y) {
       this.x = x; this.y = y; 
    }
    
    public String toString() {
        return getClass().getSimpleName() + " x=" + x + "y=" + y;
    }
    public abstract double area();
}

class Rect extends Shape {
    private int w,h;
    public Rect(int x, int y, int w, int h) {
        super(x,y);
        this.w = w; this.h = h;
    }
    public double area() {
        return w*h;
    }
    public final void f() {
        System.out.println("f");
    }
}

class Circle extends Shape {
    private int r;
    public Circle(int x, int y, int r) {
        super(x,y);
        this.r = r;
    }
    public String toString() {
        return super.toString() + " r=" + r;
    }

    public double area() {
        return Math.PI * r*r;
    }
}
