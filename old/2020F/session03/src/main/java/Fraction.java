/**
 *
 * @author dkruger
 */
public class Fraction {
    private int num, den;
    
    public Fraction(int n, int d) { // constructor
//        int g = gcd(n,d);
//        n /= g;
//        d /= g;
        num = n;
        den = d;
    }
    /*
     this           right
         num            num
         den            den
    
    
    
    
    */
    public Fraction add(Fraction right) {
      // this is the left hand side   
      //this.num   this.den  right.num  right.den
      return new Fraction(this.num*right.den+right.num*this.den, this.den*right.den);
    }
    public Fraction neg() {
        return new Fraction(-num, den);
    }
    public String toString() {  // 1/2
        return num + "/" + den;
    }
    
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1,2); // 1/2
        System.out.println(f1);
        Fraction f2 = new Fraction(1,3); // 1/3
        Fraction f3 = f1.add(f2);     //5/6  = 1/2 + 1/3
        System.out.println(f3);
        Fraction f4 = new Fraction(1,2).add(new Fraction(1,2));
        System.out.println(f4);
    }
}
