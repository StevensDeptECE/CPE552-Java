package session10;

/**
 *
 * @author dkruger
 */
public class Bus extends Vehicle {
    private int numPassengers;
    public Bus(int speed, int numPassengers) {
        super(speed);
        this.numPassengers = numPassengers;
    }
    public int getPassengers() {
        return numPassengers;
    }
    public void payToll() {
        System.out.println("$3");
    }
}
