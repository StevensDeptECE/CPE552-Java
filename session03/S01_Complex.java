/*
	class, object, message, method

	A class is a specification of an object
	An object is an instance of a class

	to instantiate an object in Java, use new
 */

public class S01_Complex {
	private double real, imag;
		
	public S01_Complex(double r, double i) {
		real = r;
		imag = i;
	}

	public String toString() {   // 1.5 - 1.0i   (1.5,-1.0)
		return
		 "(" + real + ',' + imag + ")";
	}

	public S01_Complex  add(S01_Complex right) {
		// this.real this.imag    right.real, right imag
		return new S01_Complex(this.real + right.real, this.imag + right.imag  );
	}


	public static void main(String[] args) {
		System.out.println("hello");
		System.out.println(3+2);
		int x = 5;
		S01_Complex c1 = new S01_Complex(1.5, -1.0);
		System.out.println(c1);
		S01_Complex c2 = new S01_Complex(2.4, -2.5);
		S01_Complex c3 = c1.add(c2);
		System.out.println(c3);
	}

}
