package session11;

/**
 * @author dkruger
 */
public class Threading {
    public static void main(String[] args) {
        Thread t1 = new Thread() {// Threading$1
          public void run() {
              for (;;) {
                System.out.println("hello");
                try {
                    Thread.sleep(1000);
                } catch(Exception e) { // generally bad idea to not handle exceptions you catch
                    // in this case, not terrible
                }
              }
          }
        };
        Thread t2 = new Thread(){ // Threading$2
          public void run() {
              for (;;) {
                System.out.println("goodbye");
                try {
                    Thread.sleep(2000);
                } catch(Exception e) { // generally bad idea to not handle exceptions you catch
                    // in this case, not terrible
                }
              }
          }
        };
        t1.start();
        t2.start();
//        t1.join(); // this would wait for thread 1 to complete
        System.out.println("Quitting");
    }
}
