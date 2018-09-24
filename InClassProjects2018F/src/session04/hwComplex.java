package test1;

/**
 * Rename this file Complex.java
 * Main is given.  Make the class work.
 *
 *
 *
 */

public class Complex {
	public static void main(String[] args) {
		Complex4 c1 = new Complex(1,2);
		Complex4 c2 = new Complex(1.5,2.3);
		Complex4 c3 = c1.add(c2);
		Complex4 c4 = c1.mult(c2);
		Complex4 c5 = c1.sub(c2);
		Complex4 c6 = c1.neg(); // -c1
		System.out.println(c1 + " + " + c2 + " = " + c3);
		System.out.println(c1 + " * " + c2 + " = " + c4);
		System.out.println(c1 + " - " + c2 + " = " + c5);
		System.out.println("-" + c1 + " = " + c6);
	}
}
