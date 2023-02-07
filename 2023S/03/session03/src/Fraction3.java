/*
    1/2 + 1/3 = 4/6
    Object oriented programming: extend the language
 */

public class Fraction3 {
    private int num, den; // num/den member variables, instance variables

    // constructor is a function with same name as class, and NO RETURN TYPE
    public Fraction3(int num, int d) {
        this.num = num;
        den = d;
    }

    // 1/2 + 1/3 = /6
    public Fraction3 add(Fraction3 right) {
        //this.num=1    right.num=1
        //this.den=2   right.den = 3
        Fraction3 ans = new Fraction3(this.num*right.den + right.num * this.den,
                this.den * right.den );
        return ans;
    }
    public static Fraction3 add(Fraction3 a, Fraction3 b) {
        return new Fraction3(a.num*b.den+b.num*a.den,a.den*b.den);
    }

    public String toString() {
      return num + "/" + den;
    }

    public static void main(String[] args) {
        Fraction3 a = new Fraction3(1,2); // to create an object use "new" create an instance of Fraction
        Fraction3 b = new Fraction3(1,3); // to create an object use "new" create an instance of Fraction
        Fraction3 c = a.add(b); // b.add(a)   a + b  b + a
        Fraction3 d = Fraction3.add(a,b);
        System.out.println(c);
        System.out.println(d);
    }


}
