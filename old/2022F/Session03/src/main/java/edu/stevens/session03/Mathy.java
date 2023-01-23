package edu.stevens.session03;

/**
 *
 * @author 
 */
public class Mathy {
    public static void main(String[] args) {
        for (int i = 0; i < 200; i += 10) {
           double v = factorial(i);
           System.out.println(v);
        }
        
        Circle c = new Circle(4.0); // create circle with radius 4.0
        System.out.println(c.area());
        System.out.println(c.circumference());
    }
}
