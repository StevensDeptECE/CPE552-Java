package session09;

/**
 * @author dkruger
 */
public class Account {
    private double balance;
    public synchronized void deposit(double amt) {
       balance += amt; 
    }        
    public synchronized boolean withdraw(double amt) {
        if (amt < 0)
           return false;
        if (amt > balance)
            return false;
        balance -= amt;
        return true;
    }
    public Account() {
        balance = 0;
    }
    public double getBalance() {
        return balance; 
    }
}
