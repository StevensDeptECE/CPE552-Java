package session13;

/**
 * @author dkruger
 */
public class Session13 extends Thread {
  public void run() {
    for (;;) {
      System.out.print("hello ");
      try {
        Thread.sleep(1000);
      } catch(InterruptedException e) {
      }
    }
    
  }
  
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Thread t = new Session13();
    t.start();
    for(;;) {
      System.out.print("bye ");
      try {
        Thread.sleep(500);
      } catch(InterruptedException e) {
      }      
    }
  }
  
}
