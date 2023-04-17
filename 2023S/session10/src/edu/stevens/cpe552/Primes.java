package edu.stevens.cpe552;

public class Primes {

    // O(n) n = 1000000
    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    // O(sqrt(n)) 1000
    public static boolean isPrime2(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;
        return true;
    }

    // O(sqrt(n)) 1000
    public static boolean isPrime3(int n) {
        if (n % 2 == 0 && n > 2)
            return false;
        for (int i = 3; i <= Math.sqrt(n); i+= 2)
            if (n % i == 0)
                return false;
        return true;
    }

    public static int countPrimes(int n) {
        int count = 1;
        for (int i = 3; i <= n; i+=2)
            if (isPrime(i))
                count++;
        return count;
    }
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        long primes = countPrimes(100000);
        long t1 = System.nanoTime();

        System.out.println("time:" + (t1-t0) + " primes=" + primes);
    }

}
