package language;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dkruger
 */
public class TestThreading implements Runnable {
    private String msg;
    private int delay;
    public TestThreading(String msg, int delay) {
        this.msg = msg;
        this.delay = delay;
    }


    @Override
    public void run() {
        while(true) {
            System.out.println(msg);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException ex) {
                
            }
        }
    }
    
    
    public static void main(String[] args) {
        Thread t1 = new Thread(new TestThreading("hello", 1000));
        Thread t2 = new Thread(new TestThreading("bye", 2000));
        t1.start();
        t2.start();
    }
}
