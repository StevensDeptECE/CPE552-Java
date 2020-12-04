package session13;

class Chicken {
  
}
/**
 *
 * @author dkruger
 */
public class RunnableTest extends Chicken implements Runnable {
  public void run() {
    while (true)
      System.err.println("run");
    // your thread should run for longer than it takes to create a thread
  }
  public static void main(String []args) {
    Thread t = new Thread(new RunnableTest() );
    t.start();
    
  }
}
