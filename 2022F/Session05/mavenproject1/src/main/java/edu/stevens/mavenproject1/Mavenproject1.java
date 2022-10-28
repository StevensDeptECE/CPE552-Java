package edu.stevens.mavenproject1;

/**
 */
public class Mavenproject1 {
    public static void main(String[] args) {
      Fraction f1 = new Fraction(1,2);
      Fraction f2 = new Fraction(1,3);
      Fraction f3 = new Fraction(4); //   4/1
      Fraction f4 = new Fraction(); // 0/1
      // principle of least surprise
      Fraction f5 = f1.add(f2);
      Fraction f6 = Fraction.add(f1,f2);
      int z = Fraction.f(4);
      // library functions work this way: Math.sin(x);
    }
}

class Fraction {
  private int num, den;
  public Fraction(int n, int den) {
    num = n;
    this.den = den;
  }
  public Fraction(int n) {
    this(n,1);
  }
  
  public Fraction() {
    this(0,1);
  }
  
  //return type
  public Fraction add(Fraction b) {
        // f2 is passed to b
        // what is the name for f1?  f1.add(f2) this
    return new Fraction(num*b.den+this.den*b.num, this.den*b.den);      
  }

  public static Fraction add(Fraction a, Fraction b) {
    return new Fraction(a.num*b.den+a.den*b.num, a.den*b.den);      
  }
  
  public String toString() {
    return num + "/" + den;
  }
  
  public static int f(int x) { return x*x; }
}
