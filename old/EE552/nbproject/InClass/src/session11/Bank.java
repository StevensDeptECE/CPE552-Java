package session11;

/**
 * @author dkruger
 */
public class Bank {
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
      System.out.println(a.getBalance());
      for (int i = 0; i < n; i++)
          a.withdraw(1);
      System.out.println(a.getBalance());
    }
}
