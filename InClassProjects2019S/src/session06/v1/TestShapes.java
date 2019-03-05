package session06.v1;

import session06.v2.Shape;
import session06.v2.Circle;
import session06.v2.Rect;

/**
 * @author dkruger
 */
public class TestShapes {
    public static void main(String [] args) {
        Circle c= new Circle(2.5);
        System.out.println(c.area());
        Rect r = new Rect(4, 5);
        System.out.println(r.area());
//        Circle c = new Rect(3,4);
//        System.out.println(c.area());
        
        Shape[] shapes = new Shape[20];
        shapes[0] = c;
        shapes[1] = new Circle(3.2);
        shapes[2] = r;
        
        for (int i = 0; i < 3; i++)
            System.out.println(shapes[i].area());
        
        
    }
}
