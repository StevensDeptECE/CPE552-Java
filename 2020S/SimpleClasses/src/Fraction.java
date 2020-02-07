/**
 *
 * @author dkruger
 */
public class Fraction {
    private int num; // instance variables
    private int den;
    
    public Fraction() {
        num = 0; den = 1;
    }
    public Fraction(int n, int d) {
        num = n; den = d;
    }
    
    public String toString() {
        return num + "/" + den;
    }
    // object-oriented terminology: method
    public void print() { // Java terminology: member function
       System.out.println(num + "/" + den);
    }
    public static void main(String[] args) {
        int x =0;
        Fraction a = null; // a is null
        Fraction b = new Fraction(); // insantiating
        Fraction c = new Fraction(1,2); // insantiating
        // Error Does not match: Fraction d = new Fraction(1,2,3);
        b.print(); //o-o: sending a message
        System.out.println(3);
        System.out.println("abc");
        System.out.println(3.5 + 1.25);
        System.out.println(c.toString());
    }  
}
