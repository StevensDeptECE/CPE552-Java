package session11;

/**
 * @author dkruger
 */
public class Bank2 {
    public static void main(String[] args) {
      Account a = new Account();
      final int n = 1000000;
      Thread t1 = new Thread() {
          public void run() {
              for (int i = 0; i < n; i++)
                  a.deposit(1);
          }
      };
      t1.start();
      Thread t2 = new Thread() {
          public void run() {
              for (int i = 0; i < n; i++)
                  a.deposit(1);
          }
      };
      t2.start();
      try {
          t1.join();
          t2.join();
      } catch (InterruptedException e) {
      }
      System.out.println(a.getBalance());
    }
}
