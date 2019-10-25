package session09;

/**
 * @author dkruger
 */
public class TestAccount2 {
    public static void main(String[] args) {
        Account a = new Account();
        final int n = 1000000;
        for (int i = 0; i < n; i++)
            a.deposit(1.0);
        System.out.println(a.getBalance());
        Thread t1 = new DepositThread(a, n/2);
        Thread t2 = new DepositThread(a, n/2);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(a.getBalance());
    }
}

class DepositThread extends Thread {
    private Account a;
    private int repeat;
    public DepositThread(Account a, int repeat) {
        this.a = a;
        this.repeat = repeat;
    }
    public void run() {
      for (int i = 0; i < repeat; i++)
          a.deposit(1);
    }
}
