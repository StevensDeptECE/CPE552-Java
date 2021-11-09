interface FuncOneVar {
	public double f(double x);
}

public class MathStuff {
	public static double bisection(FuncOneVar func, double a, double b, double eps) {
		double ya = func.f(a), yb = func.f(b);
		double x;
		do {
			x = (a+b)/2;
			double y = func.f(x);
			if (y < 0) {
				a = x; ya = y;
			} else if (y > 0) {
				b = x; yb = y;
			} else
				return x;
		} while (Math.abs(b-a) > eps);
		return x;
	}
	
	public static void main(String[] args) {
		FuncOneVar func = new F1();
		System.out.println(func.f(2.0)); // f(x) = x^3  2*2*2=8
		func = new F2(2, 3, 1);
		System.out.println(func.f(1.0)); // f(x) = 2x^2 + 3x + 1  = 6
	}
	
}
