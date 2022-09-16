/**
 * @author dkruger
 * cite: built in class
 */

//https://en.wikipedia.org/wiki/Complex_number
public class Complex {
    public static void main(String[] args) {
        Complex c1 = new Complex(2.5, 3.1); // r,i, real, imag  re, im
        Complex c2 = new Complex(2.7, -1.7);
        Complex c3 = c1.add(c2); // add them   c1 and c2 should not change
        Complex c4 = c1.sub(c2); // subtract them
        Complex c5 = c1.mult(c2);
        Complex c6 = c1.neg(); // -c1
        double m = c1.abs(); // magnitude of the number
        double m2 = m*m;
        double msq = c1.magSq(); // square of the abs()
        
        // add your own methods (at least double) to double your score to 200%
    }
}
