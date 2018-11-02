package session10;

/**
 *
 * @author dkruger
 */
public class Truck extends Vehicle {
    private double weight;
    private int numAxles;
    public Truck(int speed, double weight, int numAxles) {
        super(speed);
        this.weight = weight;
        this.numAxles = numAxles;
    }
    public void payToll() {
        System.out.println("$" + numAxles*20);
    }
}
