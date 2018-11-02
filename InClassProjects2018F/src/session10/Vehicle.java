package session10;

/**
 *
 * @author dkruger
 */
public abstract class Vehicle {
    private int speed;
    
    public Vehicle(int speed) { this.speed = speed; }
    public abstract void payToll();
}
