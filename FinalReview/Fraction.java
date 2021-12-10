public class Fraction {
	private int num, den;
	/*
		explain your code, as though the person reading it is a
		homicidal maniac who knows where you live
		and it's you

		write the most general constructor (with the most parameters)
	 */
	public Fraction(int n, int d) {
		num = n; den = d;
	}

	public Fraction(int n) {
		this(n,1);
	}

	public Fraction() {
		this(0,1);
	}

	public String toString() {
		return num + "/" + den;
	}
}
