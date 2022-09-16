package edu.stevens.session03;

import static java.lang.Math.*;
/**
 * @author dkruger
 */
public class Fraction {
    private int num; //分子
    private int den; 
  
  public Fraction() { // constructor
    num = 0; den = 1;     
  }

  public Fraction(int n, int d) {
    num = n; den = d;  
  }
  
  public String toString() {
    return num + "/" +  den;
  }
  
  public static double hypot(double a, double b) { // Fraction.hypot
      return Math.sqrt(a*a + b*b);
  }
  static int x = 999; // scope of a static variable is same lifetime = the whole program
  
  public static int sum3(int a, int b, int c) {
      return  a + b + c;
      //x++;
  }
  
  public static void main(String[] args) { // Fraction.main
      int a = 99; // scope is this function
      double r = hypot(3,4);
    System.out.println(r);
    
    System.out.println(sum3(1, 5, 9));
    Fraction f1 = new Fraction();  // 0/1
    Fraction f2 = new Fraction(1,2); // 1/2
    Fraction f3 = null;
    System.out.println(f1);
    System.out.println(f2);
    System.out.println(f3);

    //Fraction f2 = new Fraction(2,3); // 2/3
    //System.out.println(f1);  // 1/2
  }
}
