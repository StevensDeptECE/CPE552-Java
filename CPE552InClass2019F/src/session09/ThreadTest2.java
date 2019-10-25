package session09;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author dkruger
 */
public class ThreadTest2 {
    public static void main(String[] args) {
        Thread t = new DelayPrinter("hello", 1000);
        t.start();
        Thread t2 = new DelayPrinter("bye", 1500);
        t2.start();
    }
}

class DelayPrinter extends Thread {
    private String msg;
    private int delay;
    public DelayPrinter(String msg, int delay) {
        this.msg = msg;
        this.delay = delay;
    }
    public void run() {
        for (;;) {
            System.out.println(msg);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException ex) {
            }
        }
    }
}
