package session07;

/**
 * @author dkruger
 */
public class ClassTypes {  // session07.ClassTypes
    public static void main(String[] args) {
        
    }
}

class W extends Object {
    private int x;
    public W(int x) { this.x = x; }
    public  int getX() { return x; }
}

class X extends W {
    private int y;
    public X(int x, int y) {
        super(x);
        this.y = y;
    }
}

abstract class Shape2 {
    private int x,y;
    public Shape2(int x, int y);
    public abstract double area();
}

class Circle2 extends Shape2 {

    @Override
    public double area() {
        return 0;
    }
    
}














