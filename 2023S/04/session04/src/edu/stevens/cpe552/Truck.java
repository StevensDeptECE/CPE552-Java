package edu.stevens.cpe552;

public class Truck extends Vehicle {
    private double weight;
    public Truck(int speed, double w){
        super(speed);
        this.weight = w;
    }
    public double payToll() {
        return 100;
    }

    public String toString() {
        return "Truck speed =" + getSpeed() + " weight=" + weight;
    }
}
