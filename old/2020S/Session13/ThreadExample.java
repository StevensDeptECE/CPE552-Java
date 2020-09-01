/**
 *
 * @author dkruger
 */
public class ThreadExample {
  public static void main(String[] args) {
    MyThread t1 = new MyThread("yo", 100);
    MyThread t2 = new MyThread("ho", 280);
  }
}

class MyThread extends Thread {
  private String msg;
  private int delay;
  public MyThread(String msg, int delay) {
    this.msg = msg;
    this.delay = delay;
    this.start();
  }
  @Override
  public void run() {
    for (;;) {
      System.err.println(msg);
      try {
        Thread.sleep(delay);
      } catch(InterruptedException e) {
        
      }
    }
  }

}