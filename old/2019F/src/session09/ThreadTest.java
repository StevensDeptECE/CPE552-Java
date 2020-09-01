package session09;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author dkruger
 */
public class ThreadTest {
    public static void main(String[] args) {
        String s = "abc";
        Thread t = new A();
        t.start();
        Thread t2 = new B();
        t2.start();
    }
}

class A extends Thread {
    public void run() {
        for (;;) {
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for (;;) {
            System.out.println("Bye");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException ex) {
            }
        }
    }
}
