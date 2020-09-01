/**
 *
 * @author dkruger
 */
public class CloneTest {
    public static void main(String [] args) {
			Fraction f = new Fraction(1,2);
      Fraction g = f.clone();
			System.out.println(f == g);
			System.out.println(f.equals(g));
        
    }
}

class Fraction implements Cloneable {
	private int num, den;
	public Fraction(int n, int d) { num = n; den = d; }
	public String toString() { return num + "/" + den; }
	public Fraction clone() {
 		return new Fraction(num, den);
	}
	public boolean equals(Fraction f) {
		return num == f.num && den == f.den;
	}
}
