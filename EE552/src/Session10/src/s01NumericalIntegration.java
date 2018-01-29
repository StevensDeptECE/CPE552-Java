/**
 *
 * @author dkruger
 * 
 * integrate(   f(x), dx)
 * 
 */
interface Func1Var {
     public double f(double x);
}

// f(x) = x*x

class XSquared implements Func1Var {
    public double f(double x) { return x*x; }
}

class XCubed implements Func1Var {
    public double f(double x) { return x*x*x; }
}

public class s01NumericalIntegration {
    
    public static double integrate(Func1Var func, double a, double b, int n) {
        double h = (b-a)/n;
        double x;
        int i;
        double sum = 0;
        for (i = 0, x = a; i <= n; i++, x += h)
            sum += func.f(x)*h;
        return sum;
    }

    public static double integrate2(Func1Var func, double a, double b, int n) {
        double h = (b-a)/n;
        double x;
        int i;
        double sum = 0;
        for (i = 0, x = a; i <= n; i++, x += h)
            sum += func.f(x);
        return sum*h;
    }
    
    public static double trapezoidal(Func1Var func, double a, double b, int n) {
        double h = (b-a)/n;
        double x;
        int i;
        double sum = (func.f(a) + func.f(b)) / 2;
        for (i = 1, x = a+h; i < n; i++, x += h)
            sum += func.f(x);
        return sum*h;
    }
    
    
    public static void main(String[] args) {
        for (int n = 2; n < 32768; n *= 2) {
            double sum = integrate(new XSquared(), 0, 3, n);
            double sum2 = integrate2(new XSquared(), 0, 3, n);
            double sum3 = trapezoidal(new XSquared(), 0, 3, n);
            System.out.println(n + ":\t" + sum + ",\t" + sum2 + ",\t" + sum3);
        } 
        
    }
}
