package session04;
// package edu.stevens.cpe552.fall2018;
/**
 *
 * @author dkruger
 */
public class S00Review { // session04.S00Review
    public static void main(String[] args) {
      int a = 2;
      // 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,  
      System.out.println(session04.S01Fibonacci.fibo(10));
      
      S02Fraction f1 = new S02Fraction(1, 2);
      S02Fraction f2 = new S02Fraction(1, 3);
      S02Fraction f3 = f1.add(f2);
      System.out.println(f3);
    }
}
