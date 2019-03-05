/*
comment can go here, but no code!
*/
package session06;

/**
 *
 * @author dkruger
 */
public class A { //session06.A
    private int x;
    public A() { x = 1; System.out.println("a"); }
    public A(int x) { this.x = x; System.out.println("b"); }
    public static void main(String[] args) {
        A a1 = new A();
        B b1 = new B();
        B b2 = new B(6);
    }
}

class B extends A {
    private int y;
    public B() {
        super(3); y = 2; System.out.println("c");
    }
    public B(int y) { this.y = 4; System.out.println("d"); }
}
