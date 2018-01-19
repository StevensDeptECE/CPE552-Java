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


public class Fraction {
	private int num, den;
	
	public Fraction() {
		num = 0;  den = 1;
	}
	public Fraction(int n, int d) { 
		num = n; den = d;
	}
	
	public static void main(String[] args) {
		int x; // 0
		int y = 0;
		Fraction f1; // f1 is null
		Fraction f2 = null;
		Fraction f3 = new Fraction();
		f3.num = 1;
		f3.den = 2;
		
		Fraction f4 = new Fraction(1,2);
	}
}
