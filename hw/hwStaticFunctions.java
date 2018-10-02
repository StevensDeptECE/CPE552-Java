public class StaticFunctions {
	public static void main(String[] args) {
		countdown(10); // print 10 9 8 7 6 5 4 3 2 1 0 blastoff!
	
		for (int i = 0; i < 10; i++) // 0! = 1, 1! = 1, 2! = 2, 3! = 6, 4! = 24, 5! = 120, 6!= 720, ...
			System.out.print(fact(i) + " ");
		System.out.println();
		System.out.println(fact(20)); // can you handle a factorial this big?
		
		for (int i = 1; i <= 15; i++) // compute the fibonacci series using a loop: 1,1,2,3,5,8,13,21,34,55, ...
			System.out.print(fibo(i));     // this function should be define using a for loop to count from 1 to n
		System.out.println();
		for (int i = 1; i <= 15; i++) // compute the fibonacci series using a loop: 1,1,2,3,5,8,13,21,34,55, ...
			System.out.print(fiborecursive(i));     // this function should be define using recursion
		
    System.out.println();
		for (int i = 1; i <= 10; i++) // print the sum of square from 1 to i.  1, 1+4= 5, 1+4+9 = 14, 1+4+9+25=39, ...
			System.out.print(sumsquares(1, i));
		System.out.println();
		for (int i = 1; i <= 10; i++) // print the sum of cubes from 1 to i.  1, 1+8 = 9, 1+8+27=36, ...
			System.out.print(sumcubes(1, i));
		System.out.println();

		System.out.println(hypot(3, 4)); // compute c = length of hypotenuse: https://en.wikipedia.org/wiki/Pythagorean_theorem

		// compute area of triangle using Heron's formula: https://en.wikipedia.org/wiki/Heron%27s_formula
		System.out.print(areaOfTriangle(1.0,0,  3.0,4.0, 2.5, 4.5)) << '\n';
		
		// isPrime should return true if the number is prime, false if it is composite
		for (int i = 2; i <= 20; i++) {
			System.out.println(i + isPrime(i) ? " prime\n" : " not prime\n");
		}

		// a perfect number is one whose factors (not including itself) add up to the number
		// for example 28 =   1*28, 2*14, 4*7.  The sum 1+2+4+7+14 = 28
		for (int i = 2; i <= 10000; i++)
			if (isPerfect(i))
				System.out.print(i);
		System.out.println();

		System.out.println(sumDigits(1234)); // the sum of the digits is 1 + 2 + 3 + 4 = 10
		System.out.println(sumDigits(98)); // the sum of the digits is 9 + 8 = 17
		System.out.println(sumDigits(980100012)); // the sum of the digits is 9 + 8 + 0 + 1 + 0 + 0 + 0 + 1 + 2 = 21
	}
}
																																													 }
	
