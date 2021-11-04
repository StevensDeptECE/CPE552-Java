public class TestFraction2 {

	public static void main(String[] args) {
		Fraction a = new Fraction(1,2); // 1/2
		Fraction b = new Fraction(1,3); // 1/3
		Fraction c = a.add(b); // use member function to create a new Fraction 5/6
		Fraction d = Fraction.add(a,b); // use member function to create a new Fraction 5/6
		System.out.println(c);

		int n = c.getNum(); // create getter to access data
		int d = c.getDen();
		c.setDen(5);
	}

}
