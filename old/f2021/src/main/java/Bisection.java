

/**
 *
 * @author dkruger
 */
public class Bisection { // Bisection.bisect
    public static double bisect(FuncOneVar func, double a, double b, double eps) {
        double ya = func.f(a);
        double yb = func.f(b);
        double x;
        do {
            x = (a + b) / 2;
        
            double y = func.f(x);    if (y > 0) {
            b = x;
            } else if (y < 0) {
                a = x;
            } else {
                return x;
            }
        } while (Math.abs(b-a) > eps);
        return x;
    }
    public static void main(String[] args) {
        System.out.println(bisect(new Fsq(), 0, 5, 0.0001));
        System.out.println(bisect(new Quadratic(1, 2, 1), 0, 5, 0.0001));
     
    }
}

interface FuncOneVar {
    public double f(double x);
}

class Fsq implements FuncOneVar {
      public double f(double x) { return  x*x - 2; }
}

class Quadratic implements FuncOneVar {
    private double a,b,c;
    public Quadratic(double a, double b, double c) {
       this.a = a;
       this.b = b;
       this.c = c;
    }
    public double f(double x) { return  (a*x + b) * x + c; }
    
}


