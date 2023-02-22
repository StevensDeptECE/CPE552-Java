package edu.stevens.cpe552;

public class Car extends Vehicle { // Car IS_A Vehicle (is a kind of)
    private String color;
    public Car(int speed, String color){
        super(speed);
        this.color = color;
    }
    public double payToll() {
        return 20;
    }
    public String toString() {
        return "Car speed =" + super.getSpeed() + " color=" + color;
    }
}
