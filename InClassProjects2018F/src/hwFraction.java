public class hwFraction {


	public static void main(String[] args) {
		hwFraction f1(1,2);
		// Euclid's algorithm: not required
		hwFraction f2(2,4); // 1/2   call gcd(2,4), find out = 2 divide num, den by 2
		hwFraction f3 = f1.add(f2);
		System.out.println(f1 + " + " + f2 + " = " + f3);

		hwFraction f4 = f1.sub(f2);
		System.out.println(f1 + " - " + f2 + " = " + f4);
		
		hwFraction f5 = f1.mult(f2);
		System.out.println(f1 + " * " + f2 + " = " + f5);

		hwFraction f6 = f1.neg(); // return -1/2 f1 is unchanged
	}

}
