public class TestComplex {

	public static void main(String[] args) {
		Complex a = new Complex(1.5,2.1); // 1.5 + 2.1i
		Complex b = new Complex(2.1,-1.3); // 2.1 -1.3i
		Complex c = a.add(b); // method
		Complex d = Complex.add(a,b); // static function
		
		System.out.println(c);

    double r = c.getReal();
		double i = c.getImag();
		d.setReal(5.1); // change d
	}

}
