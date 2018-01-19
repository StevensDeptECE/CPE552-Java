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


public class Fraction3 {
	private int num, den;
	
	public Fraction3() {
		this(0,1);
	}
	public Fraction3(int n, int d) { 
		num = n; den = d;
	}
	public void print() {
		System.out.println(num + "/" + den);
	}

	public String toString() {
		return num + "/" + den;
	}
/*	
	public Fraction3 add(Fraction3 right) {
		Fraction3 ans = new Fraction3(this.num * right.den + right.num*this.den, this.den * right.den);
		return ans;
	}
	public Fraction3 add(Fraction3 right) {
		return new Fraction3(this.num * right.den + right.num*this.den, this.den * right.den);
	}*/
	public Fraction3 add(Fraction3 right) {
		return new Fraction3(num * right.den + right.num * den, den * right.den);
	}
	public static void main(String[] args) {
		Fraction3 f1 = new Fraction3(1,2);
		Fraction3 f2 = new Fraction3(1,3);
		System.out.println(f1); // automatically prints f1.toString()
		System.out.println("hi");
		System.out.println(f2);
		Fraction3 f3 = f1.add(f2);
		System.out.println(f3);
	}
}



