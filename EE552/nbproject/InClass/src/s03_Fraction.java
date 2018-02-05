/**
 *
 * @author dkruger
 */

public class s03_Fraction {
  private int num, den;

  public s03_Fraction(int n, int d) {
    num = n; den = d;
    System.out.println("testing");
  }
  
  public String toString() {
    return num + "/" + den;
  }

// return this * right
  public s03_Fraction add(s03_Fraction right) {
    return new s03_Fraction(
            num*right.den + den*right.num,
            den*right.den);
  }
  
  public static void main(String[] args) {
    s03_Fraction a = new s03_Fraction(1,2);//   1/2
    System.out.println(a);
    s03_Fraction b = new s03_Fraction(1,3);
    s03_Fraction c = a.add(b);
    System.out.println(c);
  }
}








