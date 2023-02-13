public class Fraction {
    private int num,den;
    public Fraction(int num, int d){
        this.num = num;
        this.den = d;
    }
    public Fraction(){
        this(0,1);
    }
    public Fraction(int n) {
        this(n,1);
    }
    public void setNum(int n) {
        this.num = n;
    }
    public void setDen(int d) {
        this.den = d;
    }

    public String toString(){ // 1/2  3/
        return this.num + "/" + this.den;
    }

    public Fraction add(Fraction b) { //1/2 + 1/3 = 5/6
        return new Fraction(this.num*b.den+b.num*this.den, this.den*b.den);
    }
    public static Fraction add(Fraction a, Fraction b) {
        return new Fraction(a.num*b.den+b.num*a.den, a.den*b.den);
    }

}
