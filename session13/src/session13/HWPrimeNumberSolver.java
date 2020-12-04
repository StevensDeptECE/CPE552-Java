/*
	Write k threads to split counting prime numbers between 2 and n into k parts

	100 point bonus for doing a thread pool

 */
public class HWPrimeNumberSolver {

	public static void main(String[] args) {
		int k = 4; // feel free to experiment to see if adding more threads helps or hurts
		int a = 2, b = 2000000000;
		PrimeNumberSolver threads[] = new PrimeNumberSolver[k];
		for (int i = 0; i < k; i++) {
			//create a new thread and start it working on 1/k of the problem
			threads[i] = new PrimeNumberSolver(start, end);
			threads[i].start();
		}
		int count = 0;
		for (int i = 0; i < k; i++) {
			threads[i].join();
			count += threads[i].getCount(); // get the number from this part of teh solution
		}
		// you will get here when ALL THREADS ARE DONE
		System.out.println(count);
	}
}
