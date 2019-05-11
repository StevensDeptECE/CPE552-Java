package finalReview;

/**
 *
 * @author dkruger
 */
public class CheckingAccount extends Account {
    public CheckingAccount() { super(); }
    
    public CheckingAccount(long id) { super(id); }
    
    public void writeCheck(double amt) {
        if (!withdraw(amt)) {
            System.out.println("Your check bounced");
            withdraw(25);
            return;
        }
        withdraw(1);
    }
}
