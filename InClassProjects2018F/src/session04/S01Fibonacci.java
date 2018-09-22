package session04;

/**
 *
 * @author dkruger
 */
public class S01Fibonacci {
// 1, 1, 2, 3, 5, 8, 13, ....
   public static int fibo(int n) {
      int a = 1, b = 1, c = 0;
      if (n <= 2)
          return 1;
      for (int i = 3; i <= n; i++) {
          c = a+b;
          a = b;
          b = c;
      }      
      return c;
   } 
}
