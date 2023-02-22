package edu.stevens.cpe552;

public abstract class Vehicle {
    private int speed;
    public abstract double payToll();
    public Vehicle(int speed) {
        this.speed = speed;
    }
    public int getSpeed() { return speed; }
}
