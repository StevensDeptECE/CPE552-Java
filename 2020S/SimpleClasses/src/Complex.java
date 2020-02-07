/**
 *
 * @author dkruger
 */
public class Complex {
    public static void main(String[] args) {
        Complex a = new Complex(1.5, 2.1);
        Complex b = new Complex(-1.2, 3.3);
        Complex c = a.add(b); // should be (0.3, 5.4)
        System.out.println(a + " + " + b + " = " + c);
        // (1.5,2.1) + (-1.2,3.3) = (0.3,5.4)
    }
}
