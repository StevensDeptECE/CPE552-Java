package session06.v1;

import session06.v2.Shape;

/**
 * @author dkruger
 */
public class Rect implements Shape {
    private double w, h;
    public Rect(double w, double h) { this.w = w; this.h = h; }
    public double area() { return w*h; }
}
