package session11;

/**
 * Account represents a bank account containing an amount of money
 * 
 * @author dkruger
 */
public class Account {
    private double balance; // amount of money in the account
    
    public Account() { balance = 0; }
    public synchronized void deposit(double amt) {
        
        /*
        in machine language
        load R0, amt
        load R1, balance
        add R1,R1,R0
        store R1 balance
        
        balance=3
        thread1: R1 = 4                 thread2: R1 = 4
        
        thread1 writes first  balance=4
        
        thread2 writes second balance = 4
        
        */
        balance += amt;
    }
    public synchronized boolean withdraw(double amt) {
        if (balance < amt)
            return false;
        balance -= amt;
        return true;
    }
    public double getBalance() { return balance; }    
}
