/**
 *
 * @author dkruger
 */
public class S04Fraction {
    private int num, den;
    public S04Fraction(int n, int d) {
        num = n;
        den = d;
    }
    public S04Fraction() {
        this(0,1);
    }
    public S04Fraction(int n) {
        this(n,1);
    }
    public String toString() {
        return num + "/" + den; //   "1/2"
    }
    // the name of the object you are talking to is "this"
    public S04Fraction add(S04Fraction x) {
        return new S04Fraction(num*x.den + x.num*den, den * x.den);
    }
    public static void main(String[] args) {
        S04Fraction a = new S04Fraction(1,2);
        S04Fraction b = new S04Fraction(1,3);
        S04Fraction e = a.add(b);
        System.out.println(a + " + " + b + " = " + e);
    }
}
