package edu.stevens.cpe552;

public class Circle extends Shape {
    private double r;
    public Circle(double r) { this.r = r; }
    public double area() {
         return Math.PI * r * r;
    }

}
