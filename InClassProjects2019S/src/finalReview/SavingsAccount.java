package finalReview;

/**
 * @author dkruger
 */
public class SavingsAccount extends Account {
  public SavingsAccount(long id) { super(id); }
  public void creditInterest(double rate) {
      deposit(getBalance() * rate);
  }
}
