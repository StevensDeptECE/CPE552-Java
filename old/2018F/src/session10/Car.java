package session10;

/**
 * @author dkruger
 */
public class Car extends Vehicle {
    private String color;
    public Car(int speed, String color) {
        super(speed);
        this.color = color;
    }
    public void payToll() {
        System.out.println("$20");
    }
}
