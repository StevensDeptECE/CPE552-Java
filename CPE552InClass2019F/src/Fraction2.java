/**
 *
 * @author dkruger
 */
public class Fraction2 {
    public static void main(String[] args) {
        Fraction a = new Fraction(1,2);
        Fraction b = new Fraction(1,3);
        Fraction c = a.add(b);
        Fraction d = a.neg(); // -1/2
        Fraction e = a.mult(b); // 1/6
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
