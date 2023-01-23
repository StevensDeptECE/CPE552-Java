// pow(2, 15) = 32768  pow(2,16) = 65536
pow(2,31) = 2147483648
pow(2, 32) = 4294967296
/*
+
000 = 0
001 = 1
010 = 2
011 = 3
100 = -4
101 = -3
110 = -2
111 = -1

 */


1. Data types
	int a = 5;
short b = 32767;
b += 1;
System.out.println(b); // -32768
int c = 2147483647;
c += 2;
System.out.println(c); // __________ -2147483647
double sum1 = 0, sum2 = 0;
for (int i = 0; i < 10; i++) {
	sum1 += 0.125;
  sum2 += 0.2; /1/10
}
boolean sum1eq = sum1 == 2.5; // _______
boolean sum2eq = sum2 == 2.0; // _______

double x, y;
if (Math.abs(x- y) < .00001) { // floating point approximate equal

}


	
2. Loops, if statements, arrays
	a.
{
	int sum = 4;
  for (int i = 0; i < 17; i += 3) {
		sum += i+1;
		if (i % 2 == 0)
			i++;
	}
	System.out.println(sum);
}

public static long sumFibo(int n) {
}
  b.Write a static function to sum the fibonacci number up to n
		

		c. choose(n,r) = n!/(r! (n-r)!)
	choose(52,6) = 52*51*50*49*48*47/(6*5*4*3*2)

	d.
	{
		double [] x = {1, 3, 9, 5, 2};
		double [] y = {2, 4, 1, 3, 9};
		double d = dot(x,y);
	}
	
3. Objects

	class Stats {
	private double mean,  var, max,min;

	public void stats(double a[]) {
		//		Arrays.sort(a);
		min = a[0];
		max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] < a[i+1]) {
        if (a[i] < min) {
					min = a[i];
				}
				if (a[i+1] > max) {
					max = a[i+1]
				}
			} else {
				// same thing other direction
			}
			if (a[i] < min) {
				min = a[i];
			} else
				if (a[i] > max) {
					max = a[i];
			}
		}
		
	}
  }
public class TestStats {
	public static void main(STring[] args) {
		double x[] = {1, 2, 3, 4, 5};
		Stats s;
		s.stats(x); // mean = 3, min = 1, max = 5, var ==??
		System.out.println(s.getMean());
		System.out.println(s.getMin());

		Complex a = new Complex(2.5,3.1);
		//Vec3d
		//Fraction

		ChessBoard cb = new Chessboard();
		cb.set(1,1, 0); // set position (1,1) = 0 (empty)
		cb.set(1,2, 3); // set position (1,2) = 3 (bishop)

		Fraction a = new Fraction(1,2);
		Fraction b = new Fraction(1,3);
		Fraction c = a.add(b);
		Fraction d = Fraction.add(a,b);

	}
	public class Chessboard {
		private int[][] board;

		public Chessboard() {
			board = new int[8][8];
	  }

		public void set(int row, int col, int piece) {
			board[row][col] = piece;
		}
	}

	
4. Polymorphism
	public static void main(String[] args) {
	Shape[] shapes = new Shape[3];
	shapes[0] = new Circle(100,200, 40);
	shapes[1] = new Rect(300,300, 50, 25);
	shapes[2] = new Rect(300,400, 50, 25);
	for (int i = 0; i < shapes.length; i++) {
		System.out.println(shapes[i]); // --> write toString()
		//		shapes[i].area()
		//		shapes[i].perimeter()
  }

	Vehicle [] vehicles = new Vehicle[3];
	vehicles[0] = new Car("red", 55); // red car going 55 mph
	vehicles[1] = new Bus(28, 40); // bus with 28 passengers going 40 mph
	vehicles[2] = new Truck(25000.0, 80); // truck weighing 25000lb going 80mph

	for (Vehicle v : vehicles) {
		System.out.println(v);
		v.payToll();
	}
}

5.

	public abstract class X {
	};

	//legal or illegal. If illegal explain why
	X x1; // _________
	X x2 = null; // ________
	X x3 = new X(); // illegal because abstract

	public class Y {
		public abstract void f();
	}
	Y y1 = new Y();
	// legal or ****illegal****

	public abstract  class Y {
		public abstract void f();
	}
	// legal

	Y y1 = new Y(); // illegal to instantiate an abstract class

  public class Z extends Y {
	}
	Z z1;  //___________
	Z z2 = new X(); // not parent, also abstract __________
	Z z3 = new Z(); // Z must be abstract because it does not override f()__________

	public class W extends Y {
		public void f() {

		}
	}
	Y y1 = new W(); // ______
	W w1 = new W(); // ______
 
  public class Q { // who is the parent ??? extends ... Object
