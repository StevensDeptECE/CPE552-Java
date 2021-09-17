public class S01b_Complex {
	private double real, imag;
		
	public S01b_Complex(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}

	public String toString() {   // 1.5 - 1.0i   (1.5,-1.0)
		return
		 "(" + real + ',' + imag + ")";
	}

	public S01_Complex  add(S01_Complex right) {
		return new S01_Complex(this.real + right.real, this.imag + right.imag  );
	}


	public static void main(String[] args) {
		S01b_Complex c1 = new S01b_Complex(1.5, -1.0);
		System.out.println(c1);
		S01b_Complex c2 = new S01b_Complex(2.4, -2.5);
		S01b_Complex c3 = c1.add(c2);
		System.out.println(c3);
	}

}
