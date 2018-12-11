package session12;

/**
 *
 * @author dkruger
 */
public class Stock extends Data {
    private String name;
    private double price;
    
    public Stock(String name, double price) { 
        this.name = name;
        this.price = price;
    }
    public void random() {
       price += Math.random() - 0.5;  // +/- 0.5 
       if (price < 0)
           price = 0;
       changed();
    }
    public String toString() {
        return name + " price=" + price;
    }
}
