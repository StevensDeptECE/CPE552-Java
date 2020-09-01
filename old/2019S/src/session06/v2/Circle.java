package session06.v2;

import processing.core.PApplet;

/**
 * @author dkruger
 */
public class Circle extends Shape {
    private float r;
    public Circle(float x, float y, float r) { super(x, y); this.r = r; }
    public double area() { return Math.PI * r * r; }

    @Override
    public void draw(PApplet p) {
        p.ellipse(getX(), getY(), 2*r, 2*r);
    }

}
