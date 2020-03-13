/**
 * @author dkruger
 */
public class ClassTypes {
    public static void main(String[] args) {
        new A();
        // can't instantiate abstract class: new B();
    }
}

class A { //extends Object
    private int x;
    private void g() {}
    public void h() {}
    public A() {}
    class D { // inner class has access to the outer class variables
        public void h() {
            x = 99;
        }
    }
    static class E { // name is A.E
        public void h() {
            x = 22;
        }
    }
    public void f() { //method of A
        C c1 = new C() { //anonymous inner class
            public void f() {
                
            }
        };
    }
}

abstract class B {
    private int x;
    public void g() {}
    public B() { x = 0; }
    abstract void f();
}

class ChildOfB extends B {
    public ChildOfB() {
        super();
    }
    @Override
    void f() { }
    
}
interface C {
    public void f();
}

class X implements C {
    public void f() {}   
}

interface C2 extends C {
    public void g();
}