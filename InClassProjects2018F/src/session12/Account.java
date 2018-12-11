package session12;

/**
 *
 * @author dkruger
 */
public class Account {
    private long balance;
    public Account() { balance = 0; }
    
    // addition 1 clock
    // mult 4 clock
    // function call 9
    // static function call 3
    // synchronized 30
    public synchronized void deposit(long amt) {
        balance += amt;
        // load deposit from memory --> R0
        // add amt R0
        // write R0 to memory
    }
    public synchronized boolean withdraw(long amt) {
        if (amt < balance) {
            balance -= amt;
            return true;
        }
        return false;
    }
    
    public long getBalance() {
        return balance;
    }
    
}
