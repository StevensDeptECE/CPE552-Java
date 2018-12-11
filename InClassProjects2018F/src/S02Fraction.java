/*
    class       A kind of object
    object      An instance of a class, a thing
    message     -->     method
    method      -->    method

    primitive types: int, float, double, long

encapsulation: Be stingy.  Don't give more than you have to.

*/


/**
 *
 * @author dkruger
 */
public class S02Fraction {
    private int num, den;
    public S02Fraction() {
        num = 0; den = 1;
       System.out.println("In constructor");
    }
    public S02Fraction(int n, int d) {
        num = n;
        den = d;
    }
    public S02Fraction(int n) {
        num = n;
        den = 1;
    }
    public void print() {
        System.out.println(num + "/" + den);
    }
    public String toString() {
        return num + "/" + den; //   "1/2"
    }
    public static void main(String[] args) {
        S02Fraction a = new S02Fraction(1,2); //  1/2
        S02Fraction b = new S02Fraction(1,3); // 1/3
        S02Fraction c = new S02Fraction(); //  0/1
        S02Fraction d = new S02Fraction(5); // 5/1
        a.print();
        System.out.println(a);
        System.out.println(b);
    }
}
