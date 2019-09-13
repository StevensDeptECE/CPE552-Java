
/**
 * @author dkruger
 */
public class Fraction {
    private int num, den;
    // constructor
    public Fraction(int n, int d) {
        num = n; den = d;
    }

    public String toString() {
        return num + "/" + den;
    }
    /*
    public Fraction add(Fraction right) {
        // this.num  this.den        right.num right.den
        Fraction ans = new Fraction(this.num*right.den+right.num*this.den,
                this.den * right.den);
        return ans;
    }*/
    
    //method (Object Oriented) java (member function)
    public Fraction add(Fraction right) {
        return new Fraction(num*right.den+right.num*den, den * right.den);
    }

    public Fraction add(Fraction a, Fraction b) {
       return new Fraction(a.num*b.den+b.num*a.den, a.den*b.den); 
    }
    public static void main(String[] args) {
        int a = 0;
        float b = 1.6f;
        Fraction e = null; // f has no object
        Fraction f = new Fraction(1, 2); // 1/2 
        Fraction g = new Fraction(1, 3); // 1/3
        System.out.println(f);
       // Fraction h = add(f, g);
       //Fraction x = null;
       //Fraction h = x.add(f,g);
        Fraction i = f.add(g);
        System.out.println(h);
    }
}
