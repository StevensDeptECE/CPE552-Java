package session11;

/**
 *
 * @author dkruger
 */
public class ThreadIntro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread t = new Thread() {
            public void run() {
                while (true) {
                System.out.println("goodbye");
                try {
                    Thread.sleep(2000);
                } catch(InterruptedException e) {}
                }
            }
        };
        t.start();
            for (;;) {
                System.out.println("hello");
                try {
                    Thread.sleep(1000);
                } catch(InterruptedException e) {}
            }
        
        
        
    }
    
}
