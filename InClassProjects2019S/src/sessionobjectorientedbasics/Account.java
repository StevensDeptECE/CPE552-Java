package sessionobjectorientedbasics;

/**
 * @author dkruger
 */
public class Account {
    private double balance;
    
    public Account() {
//        if (name.equals("Dov") && id == 123)
//            balance = 1e20;
        balance = 0; }
    
    public synchronized void deposit(double amt) {
        balance += amt;
    }
    
    public synchronized boolean withdraw(double amt) {
        if (amt > balance)
            return false;
        balance -= amt;
        return true;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public static void main(String[] args) {
        Account a = new Account();
        final int n = 10000000;
        //doDepositsWithdrawalsSynchronously(a, n);
        multiThreaded(a, n);
        System.out.println(a.getBalance());
    }
    
    public static void multiThreaded(Account a, int n) {
        Thread t1 = new Deposits(a, n);
        
        Thread t2 = new Withdrawals(a, n);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch(InterruptedException e) {
        }
    }
    
    public static void doDepositsWithdrawalsSynchronously(Account a, int n) {
        for (int i = 0; i < n; i++)
            a.deposit(1);            
        for (int i = 0; i < n; i++)
            a.withdraw(1);
    }
    public static class Deposits extends Thread {
        private Account a;
        int n;
        public Deposits(Account a, int n) { this.a = a; this.n = n; }
        public void run() {
        for (int i = 0; i < n; i++)
            a.deposit(1);            
        }
    }
    public static class Withdrawals extends Thread {
        private Account a;
        private int n;
        public Withdrawals(Account a, int n) { this.a = a; this.n = n;}
        public void run() {
        for (int i = 0; i < n; i++)
            a.withdraw(1);            
        }
    }
}
