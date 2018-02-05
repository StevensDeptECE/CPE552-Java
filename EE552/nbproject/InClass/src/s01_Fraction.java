/**
 *
 * @author dkruger
 */
// class: a kind of object
// object: is an example of (an instance of) a class
// message
// method

public class s01_Fraction {
  private int numerator, denominator;

  public s01_Fraction(int n, int d) {
    numerator = n; denominator = d;
  }
  
  public String toString() {
    return numerator + "/" + denominator;
  }
  
  public static void main(String[] args) {
    s01_Fraction a = null;
    System.out.println(a);
    a = new s01_Fraction(1,2);//   1/2
    System.out.println(a);
  }
}
