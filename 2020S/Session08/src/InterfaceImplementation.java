/**
 *
 * @author dkruger
 */
public class InterfaceImplementation {
    public static void main(String[] args) {
        A a1 = new B();
        a1.f(); // should print "hello"
        a1.g(); // should print "bye"
    }
}

interface A {
    public void f();
    public void g();
}

class B implements A {
    public void f() { System.out.print("hello");
    public void g() { System.out.print("bye");
}