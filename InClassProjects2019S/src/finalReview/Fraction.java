package finalReview;

/**
 * @author dkruger
 */
public class Fraction {
    private int num, den;
    public Fraction(int n, int d) throws DivByZero {
        if (d == 0)
            throw new DivByZero();
        this.den = d;
        this.num = n;
    }
    
    public static void main(String[] args) {
       try {
           Fraction f = new Fraction(1,0);
           
       } catch(DivByZero e) {
          e.printStackTrace(); 
       }
    }
            
}
