package session06.v2;

import processing.core.PApplet;

/**
 * @author dkruger
 */
public class Rect extends Shape {
    private float w, h;
    public Rect(float x, float y, float w, float h) {
        super(x, y);
        this.w = w; this.h = h;
    }
    public double area() { return w*h; }

    @Override
    public void draw(PApplet p) {
        p.rect(getX(), getY(), w, h);
    }
    
}
