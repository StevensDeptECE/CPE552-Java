/**
 *
 * @author dkruger
 */
public class Fraction extends Object {
    private int num, den;
    public Fraction(int n, int d) {
       num = n; den = d; 
    } 
    public Fraction(int n) {
        this(n, 1);
    } 
    public Fraction() {
        this(0,1);
    } 
    public void append(StringBuilder b) {
        b.append(num).append('/').append(den);
    }
    public String toString() {
        return num + "/" + den;
    }
}
