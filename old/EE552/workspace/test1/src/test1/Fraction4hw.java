package test1;

/**
 * 
 * @author dkruger
 *
 * Fraction represents rational numbers
 *
 *       num
 *      -----
 *       den
 *
 *
 */

public class Fraction4 {

	public static void main(String[] args) {
		Fraction4 f1 = new Fraction4(1,2);
		Fraction4 f2 = new Fraction4(2); //  2/1
		Fraction4 f3 = new Fraction4(1); // 1/1
		Fraction4 f4 = f1.add(f3); // 1/1 + 1/2 = 3/2
		Fraction4 f5 = f1.mult(f1); // 1/2 * 1/2 = 1/4
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f4);
		System.out.println(f5);
	}
}



