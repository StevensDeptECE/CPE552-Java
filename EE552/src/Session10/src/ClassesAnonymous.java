/**
 *
 * @author dkruger
 */

interface FuncOneVar {
    public double f(double x);   
}
public class ClassesAnonymous {
    private int x;
    private class Inner {
        public void g() {
            System.out.println(x); // mycontainer.x
        }
    }
    
    private static class StaticInner {
        public void g() {
            // ILLEGAL: System.out.println(x); // mycontainer.x
        }        
    }
    
    public ClassesAnonymous() {
        System.out.println("Building outer object");
    }
    public void f() {
        Inner in = new Inner(); // why is this legal?
        FuncOneVar func = new FuncOneVar() { // ClassesAnonymous$1 
          public double  f(double x) { return Math.sqrt(x); }  
        };
    }
    public static void main(String[] a) {
        System.out.println("hello");
        
        //inner class CANNOT BE INSTANTIATED WITHOUT AN OUTER OBJECT
        //ILLEGAL: no outer object Inner in  = new Inner();
        ClassesAnonymous ca = new ClassesAnonymous();
        ca.f();
        
    }
}
