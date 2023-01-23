package edu.stevens.session03; // convention packages are lowercase

import static java.lang.Math.*;
/**
 * @author dkruger
 */
public class Fraction2 { // class names start with CapitalLetterLikeThis
    private int num; //分子
    private int den; 
  
  public Fraction2() { // constructor
    num = 0; den = 1;     
  }

  public Fraction2(int n, int d) {
    num = n; den = d;  
  }
  
  public String toString() { // methods or functions start with lowerCaseCamelCase
    return num + "/" +  den;
  }
  /*
    this           b                this+b
       num=1         num=2            this.num*b.den + b.num*this.den
       den=2         den=3

*/
  // in methods, the object is called "this"
/*
public Fraction2 add(Fraction2 b) {
     Fraction2 ans = new Fraction2(this.num*b.den+b.num*this.den, this.den*b.den);
     return ans;     
  }
*/
  // same but shorter
  public Fraction2 add(Fraction2 b) {
      return new Fraction2(this.num*b.den+b.num*this.den, this.den*b.den);
  }


  public static Fraction2 add(Fraction2 a, Fraction2 b) {
     Fraction2 ans = new Fraction2(a.num*b.den+b.num*a.den, a.den*b.den);
     return ans;     
  }


  public static void main(String[] args) {
    // in c++ snake case  this_is_a_long_variable_name123
      
    Fraction2 a = new Fraction2(1,2);
    Fraction2 b = new Fraction2(2,3);
    Fraction2 c = a.add(b); // b.add(a); method
    Fraction2 d = add(a,b); // static function  Fraction.add(
  }
}
