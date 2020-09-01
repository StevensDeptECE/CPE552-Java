import java.awt.event.*;

public class S00_MidtermReview {
	public static void dataTypesAndOperators() {
		int a = 3 / 2 * 2;
		int b = (int)3.0 / 2 * 2;
		int c = (int)(3.0 / 2 * 2);
		double d = 1 / 2; // 0.0

		System.out.println(a + " " + b + " " + c + " " + d);
		// What are the data types in java?
		long L0 = 123455667889L;
		short s = 32767; // -32768
		char c = 'x';
		char c = '\u03d0'; //http://unicode.org/charts/

		byte b = -128; // 127
		boolean b = false; // true
		if (b) {

		}

		double x = 1.25; // 1.23456789012345
		float y = 1.25f; // 1.234567
		int z = a + b;
		z = a - b;
		z = a * b;
		z = a / b;
		z = a % b;

		z += a; // add a to z (z = z + a)
		z -= a;
		z *= a;
		z /= a;
		z %= a;

		z *= a + 1;
			
	}

	public static void operators() {
		int a = 2, b = 3, c = 4;
		a += b *= c -= 2; // c = 2, b = 6 , a = 8
	}

	public static void statements() {
		if (b) {

		}

		if (b) {

		} else {

		}

		while (b) {

		}

		do {


		} while (b);
		switch(c) {
		case 1: System.out.println("yes"); break;
		case 2: System.out.println("no"); break;
		default:  System.out.println("maybe"); break;
		}

		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++)
				System.out.print(i*j + "\t");
			System.out.println();
		}
	}
	
	public static void arrays() {
    int[] a = new int[10]; // a.length
		int  b = 2;
		int c = b;
		int[] d = a;
		d[0] = 5;

		int[][] table = new int[10][10]; // 2d array

		int[][] table2 = {
			{1, 2, 3},
			{2, 5}
			{5, 4, 2, 1, 2}

		};



		
		
	}

	public void classes() {
	}

	public static void main(String[] args) {
		dataTypesAndOperators();
		statements();
		arrays();
		classes();
		inheritance();
	}
}

/*
public interface ActionListener {
	public void actionPerformed(ActionEvent e);
}
*/
