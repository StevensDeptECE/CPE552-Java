public class Fraction {

	private int num, den; // num/den

	public Fraction(int num, int den) {
		this.num = num;
		this.den = den;
	}

	public Fraction add(Fraction b) {
		return new Fraction(num*b.den + b.num*den,
												den*b.den);
	}

	public static Fraction add(Fraction a, Fraction b) {
		return new Fraction(a.num*b.den + b.num*a.den,
												a.den*b.den);
	}

	public String toString() {
		return  num + "/" + den ;
	}

  public int getNum() { return num; }
	public int getDen() { return den; }
	public void setDen(int d) { den = d; }
	
}


