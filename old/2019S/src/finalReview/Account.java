package finalReview;

/**
 * @author dkruger
 */
public abstract class Account {
   private long id;
   private double balance;
   
   public Account() { id = 0; }
 
   public Account(long id) {
       this.id = id;
       balance = 0;
   }
   public void setId(long id) { this.id = id; }
   public long getId() { return id; }
   
   public void deposit(double amt) {
       balance += amt;
   }
   public boolean withdraw(double amt) {
       if (amt > balance)
           return false;
       balance -= amt;
       return true;
   }
   public double getBalance() { return balance; }
   public void creditInterest(double rate) {}
}
