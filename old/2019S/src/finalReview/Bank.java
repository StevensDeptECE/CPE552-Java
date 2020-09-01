package finalReview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * account number 12399786
 * account number  12399789
 * account number 12599792
 * @author dkruger
 */
public class Bank {
//    private ArrayList<Account> accounts;
    private HashMap<Long, Account> accounts;
    static long uniqueAccountId;
    static int bankCount;
    static double interestRate;
    
    static {
        uniqueAccountId = 0;
        bankCount = 0;
        interestRate = 0.01;
    }

    private static long getUniqueAccountId() {
        return ++uniqueAccountId;
    }
    public Bank() {
        bankCount++;
        accounts = new HashMap<>(2048);
    }
    
    public void newCheckingAccount(Customer c, double initialBalance) {
        Account a = new CheckingAccount(getUniqueAccountId());
        a.deposit(initialBalance);
        accounts.put(a.getId(), a);
        
    }
    public void newSavingsAccount(Customer c, double initialBalance) {
        Account a = new SavingsAccount(getUniqueAccountId());
        a.deposit(initialBalance);
        accounts.put(a.getId(), a);
        
    }

    public void creditInterest() {
       double rate = interestRate + 1;
        for (Map.Entry<Long, Account> e : accounts.entrySet()) {
            Account a = e.getValue();
            a.creditInterest(rate);
        }
    }
    public void closeAccount(long id) {
        accounts.remove(id);
        //TODO: GIVE CUSTOMER THE $$$$!
    }
    
    
    
}
