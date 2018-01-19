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


public class Fraction2 {
	private int num, den;
	
	public Fraction2() {
		num = 0;  den = 1;
	}
	public Fraction2(int n, int d) { 
		num = n; den = d;
	}
	void print() {
		System.out.println(num + "/" + den);
	}
	
	
	Fraction2 add(Fraction2 right) {
		Fraction2 ans = new Fraction2();
		ans.num = this.num * right.den + right.num*this.den;
		ans.den = this.den * right.den;
		return ans;
	}
	public static void main(String[] args) {
		Fraction2 f1 = new Fraction2(1,2);
		Fraction2 f2 = new Fraction2(1,3);
		f1.print();
		f2.print();
		Fraction2 f3 = f1.add(f2);
		f3.print();
	}
}



