package session12;

/**
 *
 * @author dkruger
 */
public class ThreadTest {
    public static void main(String[]args) {
        Thread t1 = new Thread() {
            public void run() {
               while (true) {
                   System.out.println("hello");
                   try {
                       Thread.sleep(1000);
                   } catch(InterruptedException e) {}
               }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                for (;;) {
                   System.out.println("goodbye"); 
                   try {
                       Thread.sleep(1000);
                   } catch(InterruptedException e) {}
                }
            }
        };
        t1.start();
        t2.start();
        for (int i = 0; i < 10; i++)
            System.out.println(i);
        System.out.println("Done");
    }
}
