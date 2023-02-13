public class Main {
    public static void main(String[] args) {
        Fraction a = null;
        a = new Fraction();  //  0/1
        //a.num = 52;
        a.setNum(52);
        a.setDen(9);
        Fraction b = new Fraction(1,2); // 1/2
        Fraction c = new Fraction(3); // 3/1
        Fraction d = new Fraction(5,0); // stop this!

        System.out.println(a);
        Fraction e = b.add(c);
        Fraction f = Fraction.add(b,c);
    }
}