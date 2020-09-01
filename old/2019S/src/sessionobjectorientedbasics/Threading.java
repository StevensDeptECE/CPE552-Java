package sessionobjectorientedbasics;

/**
 * @author dkruger
 */
public class Threading {
    public static void main(String[] args) {
        Thread t = new Thread() {
            public void run() {
                for (;;) {
                    System.out.println("hello");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {}
                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                for (;;) {
                    System.out.println("bye");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {}
                }
            }
        };
        t.start();
        t2.start();
        
    }
}
