package edu.stevens.cpe552;

public class Rect extends Shape {
    private double W, L;
    public Rect(double W, double L) {
        this.W = W;
        this.L = L;
    }
    public double area() {
        return W*L;
    }
}
