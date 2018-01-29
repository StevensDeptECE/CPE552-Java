package test1;

/**
 * 
 * @author dkruger
 *
 *
 *
 */

public class Complex4 {

	public static void main(String[] args) {
		Complex4 c1 = new Complex(1,2);
		Complex4 c2 = new Complex(1.5,2);
		Complex4 c3 = c1.add(c2);
		Complex4 c4 = c1.mult(c2);
		Complex4 c5 = c1.sub(c2);
		Complex4 c6 = c1.neg(); // -c1
		System.out.println(c1); // 1+2i  (1,2)  choose one representation
		Complex4 c7 = c1.conj();
	}
}



