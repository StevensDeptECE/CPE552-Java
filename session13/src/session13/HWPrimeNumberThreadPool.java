/*
	Write k threads to split counting prime numbers between 2 and n into k parts

	100 point bonus for doing a thread pool

 */
public class HWPrimeNumberSolverThreadPool {
	private long count;

	public synchronized void addToCount(int count) {
		this.count += count;
	}
	
	public HWPrimeNumberSolverThreadPool(int k, long a, long b, long chunkSize) {
		PrimeNumberSolver threads[] = new PrimeNumberSolver[k];
		for (int i = 0; i < k; i++) {
			threads[i] = new PrimeNumberSolver();
		}
		for (long i = a; i <= b; i += chunkSize) {
			// assign next available thread
			PrimeNumberSolver solver = pool.getNextAvailableThread();
      count += solver.assign(this, a, a+chunkSize-1);
		}

		waitForAllThreadsToFinish();
		// you will get here when ALL THREADS ARE DONE
		System.out.println(count);
	}

	public static void main(String[] args) {
		new  HWPrimeNumberSolverThreadPool(4, 2, 2000000000, 10000000);
	}

	}
