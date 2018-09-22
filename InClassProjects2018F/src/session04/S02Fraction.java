package session04;

/**
 *
 * @author dkruger
 */
public class S02Fraction {
    private int num, den;
    public S02Fraction(int n, int d) {
       num = n; 
       den = d;
    }
    public S02Fraction add(S02Fraction right) {  // 1/2 + 1/3  = 5/6
        return new S02Fraction(num *right.den + right.num*den, den*right.den);
    }
    public String toString() {
      return num + "/" + den;   
    }
}
