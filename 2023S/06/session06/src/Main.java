import edu.stevens.cpe552.*;

public class Main {
    public static void main(String[] args) {
        Vec3d v = new Vec3d(1.0, 2.0, 3.0);

        Shape s;
        Circle c = new Circle(3.0);     // radius = 3
        Rect r = new Rect(2.5, 10.5);
        s = c;
        s = r;
        System.out.println(c.area());
        System.out.println(r.area());
        System.out.println(s.area()); //polymorphism

        System.out.println("Hello world!");
    }
}
