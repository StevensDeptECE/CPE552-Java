package edu.stevens.cpe552;
/**
 * Conventions: packages are lowercase
 *              classes are UpperCaseCamelCase
 * 
 * @author dkruger
 */
public class Objects {
    public static void main(String[] args) {
        int x; // x = 0
        A a1 = null;
        a1 = new A(); //legal?
        System.out.println(a1.x);
        B b1 = new B();
//        C c1 = new C();
        F f1 = new F(); // create an object of type F
        E e1 = new E() {
            public void g() {
                System.out.println("Anonymous class");
            }
        };
    }
}

class A {
    int x; //default
    public A() {}
}

class B extends A {
    public B() {
        super();
    }
}

abstract class C {
    public abstract void f();
}

interface D {
    public void g();
}

abstract class E implements D {
}

class F extends E {
    public void g() {}
}








