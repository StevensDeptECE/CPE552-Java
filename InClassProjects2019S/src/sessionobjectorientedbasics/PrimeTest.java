package sessionobjectorientedbasics;

/**
 * @author dkruger
 */
public class PrimeTest {
    public static int countPrimes(int n) {
      int count = 1; // 2 is prime
    nextPrime:
      for (int i = 3; i <= n; i += 2) {
          for (int j = 3; j <= Math.sqrt(i); j += 2)
              if (i % j == 0)
                  continue nextPrime;
          count++;
      }
      return count;
    }
    public static void main(String[] args) {
       System.out.println(countPrimes(1000));
        
    }
}
