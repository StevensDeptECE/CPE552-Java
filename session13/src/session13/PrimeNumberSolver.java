public class PrimeNumberSolver {
	public static long countPrimes(long a, long b) {
		long count = 0;
		if (a % 2 == 0) {
			if (a == 2)
				count++;
		  a++;
		}
	outer:
		for (long i = a; i <= b; i+=2) { //O(n)
			for (long j = 3; j <= (long)Math.sqrt(i); j += 2) 
				if (i % j == 0)
					continue outer;
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		//    System.out.println(countPrimes(2, 10));
		//    System.out.println(countPrimes(2, 100));
		//    System.out.println(countPrimes(2, 1000));
		//    System.out.println(countPrimes(2, 1000000));
		System.out.println(countPrimes(2, 10000000));

		/*approaches for multithreading:

			for (long i = a to b)
			  spawn a thread to calculate if i is prime


				better: split in two parts
				a to (a+b)/2     and (a+b)/2+1 to b


				best: (thread pool)
          create k thread
					pick a chunk size: a to b     (b-a)/20
					assign to each thread to do a part. When it's done, submit answer
		 */
	}
}
