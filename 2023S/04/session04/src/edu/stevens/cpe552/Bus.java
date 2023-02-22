package edu.stevens.cpe552;

public class Bus extends Vehicle {
    private int numPass;
    public Bus(int speed, int numPass){
        super(speed);
        this.numPass = numPass;
    }
    public double payToll() {
        return 4;
    }
    public String toString() {
        return "Bus speed =" + getSpeed() + " passengers=" + numPass;
    }
}
