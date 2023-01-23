package edu.stevens.session03;

/**
 *
 * @author 
 */
public class Complex {
    public static void main(String[] args) {
        Complex c1 = new Complex(1.5, -1.2); // 1.5-1.2i  (1.5,-1.2)
        System.out.println(c1); // print the value above
        Complex c2 = new Complex(0.8, 1.5);
        Complex c3 = c1.add(c2); // do the addition
        System.out.println(c3);
        Complex c4 = c3.scale(2.5); // multiply by scalar
        System.out.println(c4);
        Complex c5 = c3.mult(c3); // complex multiply
        System.out.println(c5);
    }
}
