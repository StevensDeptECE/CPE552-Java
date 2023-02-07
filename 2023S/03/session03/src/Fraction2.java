/*
    1/2 + 1/3 = 4/6
    Object oriented programming: extend the language
 */

public class Fraction2 {
    private int num, den; // num/den member variables, instance variables

    // constructor is a function with same name as class, and NO RETURN TYPE
    public Fraction2(int num, int d)
    {
        this.num = num;
        den = d;
    }

    public String toString() {
      return num + "/" + den;
    }

    public static void main(String[] args) {
        Fraction2 f = new Fraction2(1,2); // to create an object use "new" create an instance of Fraction
// Don't do this        System.out.println(f.num + ", " + f.den);
        System.out.println(f);
    }


}
