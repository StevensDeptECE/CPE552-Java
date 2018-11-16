package session12;

/**
 *
 * @author dkruger
 */
public class TestAccount {
    public static void main(String[] args) throws InterruptedException {
        Account a = new Account();
        final int n = 1000000;
        Thread t1 = new Thread() {
            public void run() {
                for (int i = 0; i < n; i++)
                   a.deposit(1);
            }
        };
        System.out.println(a.getBalance());
        Thread t2 = new Thread() {
            public void run() {
                for (int i = 0; i < n/2; i++)
                    a.withdraw(1);
            }
        };
        t1.start();
        Thread.sleep(5);
        t2.start();
        t1.join();
        t2.join();
        System.out.println(a.getBalance());        
    }
}
