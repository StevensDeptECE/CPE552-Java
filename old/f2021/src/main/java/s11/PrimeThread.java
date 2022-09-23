//package s11;
/**
 * @author dkruger
 */
public class PrimeThread {
    public static boolean isPrime(int n) {
        for (int i = 3; i <= Math.sqrt(n); i+= 2)
          if (n % i == 0)
            return false;
        return true;
    }
    public static void countPrimesSingleThreaded(int n) {
        int count = 1; // 2 is prime
        for (int i = 3; i <= n; i += 2)
          if (isPrime(i))
            count++;
				//  int count = countPrimes(n); //O(n sqrt n)
        System.out.println("count=" + count);
    }
	public static void countPrimesMultiThreaded(int n, int numThreads) {
		//    for (int i = 0; i < numThreads; i++) {
			PrimeWorker w1 = new PrimeWorker(3, n/2);
			PrimeWorker w2 = new PrimeWorker(n/2+1, n);
			Thread t1 = new Thread(w1);
			Thread t2 = new Thread(w2);
			t1.start();
			t2.start();
			try {
				t1.join();
				t2.join();
			} catch (InterruptedException e) {
				System.out.println("Good morning!");
			}
			// once we get here, all threads are done
			int count = w1.getAnswer() + w2.getAnswer();
			System.out.println("count=" + count);
	}
	public static void main(String[] args) {
		final int n = 10000000;
		//		countPrimesSingleThreaded(n);
		countPrimesMultiThreaded(n, 2);
		
		long t0 = System.nanoTime();
		//		countPrimesSingleThreaded(n);
		countPrimesMultiThreaded(n, 2);
		long t1 = System.nanoTime();
		System.out.println("Elapsed: " + (t1-t0));
	}
}

class PrimeWorker implements Runnable {
	private int start, end;
	private int count;
	public PrimeWorker(int start, int end) {
		if (start % 2 == 0)
			start++;
		this.start = start;
		this.end = end;
	}
	public int getAnswer() { return count; }
	private static boolean isPrime(int n) {
		for (int i = 3; i <= Math.sqrt(n); i+= 2)
			if (n % i == 0)
				return false;
		return true;
	}
	public void run() {   
		int count = 1; // 2 is prime
		for (int i = start; i <= end; i += 2)
			if (isPrime(i))
				count++;
		this.count = count;
	}
}
