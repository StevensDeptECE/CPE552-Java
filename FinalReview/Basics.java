import static java.lang.Math.*;

public class Basics {
	public static void integerops() {
		int a = 3 / 2;
		int b = 7 % 3 + 8 % 3 + 9 % 3;
		System.out.println(a + "," + b);
	}

	public static void precedence() {
    int a = 2 + 3 * 4;
		int b = 2 / 3 * 3;
		int c = 2 * 3 / 3;
		int d = 2 % 3 * 3;
		System.out.println(a + "," + b + "," + c + "," + d);
	}

	public static void castingAndConversion() {
		double a = 3 / 4;
		double b = (int)1.5 * 2;
		int c = (int)-1.9; // cast
		float d = (float)1.5; // must cast when converting down
		System.out.println(a + "," + b + "," + c);		
	}

	public static void mathlibrary() {
		double y = Math.sqrt(2.0);
		// because of the import now we can just use functions
		y = sin(0.0);
		double x = 0;
		double theta = atn2(y, x); // do not use atn(y/x)
	}
	
	public static void infAndNan() {
		double x = 1.0 / 0.0;
		double y = -1.0 / 0.0;
		double z = x + y;
		double w = 0.0 / 0.0;
		double a = sqrt(x);
		double b = sqrt(y);
		double c = sin(x);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("z=" + z);
		System.out.println("w=" + w);
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);
	}
		
  public static void main(String[] args) { // <-- entry point
		for (int i = 0; i < args.length; i++)
			System.out.println(args[i]);

		integerops();
		precedence();
		castingAndConversion();
		mathlibrary();
	}

}
