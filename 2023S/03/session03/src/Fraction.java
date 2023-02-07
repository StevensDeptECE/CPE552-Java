/*
    1/2 + 1/3 = 4/6
    Object oriented programming: extend the language
 */

public class Fraction {
    private int num, den; // member variables, instance variables
    public Fraction() {
        System.out.println("In the constructor Fraction");
    }

    public static void main(String[] args) {
        int a = 3;
        double b = 3.5;
        float c = 2.5f;
        int d = 5;

        d = a;
        Fraction f = new Fraction(); // to create an object use "new" create an instance of Fraction
        f.num = 1;
        f.den = 2;
        System.out.println(f.num + ", " + f.den);

        Fraction f2 = f;
        Fraction f3 = new Fraction();
        System.out.println(f);
        System.out.println(f2);
        System.out.println(f3);
    }


}
