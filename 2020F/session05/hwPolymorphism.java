import java.awt.Shape;
import java.util.ArrayList;

public class hwPolymorphism {
  public static void main(String[] args) {
    ArrayList<Shape> shapes = new ArrayList<>();
    shapes.add(new Circle(10,20, 30)); // x=10,y=20, r=30
    shapes.add(new Rect(100,200, 50, 70)); // x=100,y=200, w=50,h=70

    //Circle x=10 y = 20 radius = 30
    // Rect x=100 y = 200 w=50 h=70
    for (int i = 0; i < shapes.size(); i++) {
      System.out.println(shapes.get(i)); // polymorphic call to toString()
      System.out.println(shapes.get(i).area());
      System.out.println(shapes.get(i).perimeter());
    }
  }    
}
