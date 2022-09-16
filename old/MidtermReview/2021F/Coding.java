/*
	integer operators
	= operators
	type promotion

 */

public class Coding {
	public static void operators() {
		int a = 2 + 3 * 4;
		int b = 5 / 2 + 7 / 2;
		int c = 4 % 3 + 5 % 3 + 6 % 3;

		int d = 2;
		a += b *= c += d; // c = 5  b = 25 a = 39

		a = b = c= 3;

		for (int i = 1; i <= 100; i*= 3 + 1)
			System.out.println(i);

		double x = 1;
		// error: type demotion is not legal		int y = 1.1;
		int y = (int)1.1;     // I mean it! (use a cast)
		int y2 = (int)1234e+20; //probably wrong

		float sum = 0;
		for (int i = 1; i <= 100; i++)
			sum += 1.0f/i;

		for (float i = 1; i <= 100; i++)
			sum += 1/i;

		for (int i = 1; i <= 100; i++)
			sum += 1/(float)i;

		double x = 3 / 2; // THIS WILL BE ON THE TEST!

		double w = (int)2.5 * 2 + 5 / 2;

		// + - * /   no modulo (% only applies to int)
		w = -w;

		//		bit operations :  << >> <<< & | ^ ~ (NOT ON TEST)
	}


	
	public static void statements() {
		boolean b = true;
		if (b) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		if (b) {

		}

		while (true) { // infinite loop
			System.out.println("infinite loop!");
		}

		for (;;) { // infinite loop

		}

		for (int i = 0; i < 10; i++) {

		}

		for (int i = 1; i <= 1024; i *= 2) {

		}

		// not on test

		int i = 1;
		do {
			System.out.print(i);
		} while (i++ < 10);

		int i = 10;
		while (i < 10) {
			System.out.print(i);
			i++;
		}


		int x = 1;

		switch(x) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
		case 5:
			System.out.println("five");
		default:
			System.out.println("something");
		}


		double y = 0.9 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
		switch(y) { // switch statement is ONLY FOR INTEGER TYPES!!!
		case 1.5:

		case 2.3:

		}

		for (int i = 0; i < 10; i++) {
			if (i % 7 == 0)
				break; // get out
			System.out.println(i);
		}

		for (int i = 0; i < 10; i++) {
			if (i % 7 == 0)
				continue; // skip this one
			System.out.println(i);
		}
				
		
	}
	
	int f(int x) {

		return x + 1;
	}
	
	public static void main(String[] args) {
		int[] x = {1, 2, 3};
		ActionListener a = new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			};
	}
}

/* note: no ; at end of class! */
