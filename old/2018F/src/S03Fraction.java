/*
    1/2  + 1/3 = 5 /6        



*/

/**
 *
 * @author dkruger
 */
public class S03Fraction {
    private int num, den;
    public S03Fraction() {
        num = 0; den = 1;
       System.out.println("In constructor");
    }
    public S03Fraction(int n, int d) {
        num = n;
        den = d;
    }
    public S03Fraction(int n) {
        num = n;
        den = 1;
    }
    public String toString() {
        return num + "/" + den; //   "1/2"
    }
    // the name of the object you are talking to is "this"
    public S03Fraction add(S03Fraction x) {
        S03Fraction ans = new S03Fraction(this.num*x.den + x.num*this.den,
                                            this.den * x.den);
        return ans;
    }
    public static void main(String[] args) {
        S03Fraction a = new S03Fraction(1,2); //  1/2
        S03Fraction b = new S03Fraction(1,3); // 1/3
        S03Fraction e = a.add(b);
//        S03Fraction f = S03Fraction.add(a,b);
        System.out.println(a + " + " + b + " = " + e);
    }
}
