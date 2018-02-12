package session03;

/**
 *
 * @author dkruger
 */

public class s02_Fraction {
  private int numerator, denominator;

  public s02_Fraction(int n, int d) {
    numerator = n; denominator = d;
    System.out.println("testing");
  }
  
  public String toString() {
    return numerator + "/" + denominator;
  }
  
  public static void main(String[] args) {
    s02_Fraction a = new s02_Fraction(1);//   1/2
    System.out.println(a);
  }
}
