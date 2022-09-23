package session11;

/**
 *
 * @author dkruger
 */
public class Account {
    private String name;
    private double balance;
    
    public Account(String name) {
        this.name = name;
        balance = 0;
    }
    
    public void deposit(double amt) {
        balance += amt;
        // read balance         100
        // add balance +amt     100+1 ==>101
        //write back new balance    write 101
        
        
    }
    
    public boolean withdraw(double amt) {
        if (balance < amt)  // 100 > 1
            return false;
        balance -= amt;  // read balance 100  -1 ==> 99  write 99
        return true;
    }
    public double getBalance() { return balance; }
    
    
    public static void main(String[] args) throws InterruptedException {
        final int n = 1000000;
        Account a = new Account("Dov");
        Thread t = new Thread() {
            public void run() {
                for (int i = 0; i < n; i++)
                    a.deposit(1);                
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                for (int i = 0; i < n/2; i++)
                    a.withdraw(1);
            }
        };
        t.start();
        t2.start();
        t.join();
        t2.join();
        System.out.println(a.getBalance());
    }
}
