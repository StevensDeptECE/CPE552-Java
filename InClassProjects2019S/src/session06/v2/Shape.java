package session06.v2;

import processing.core.*;
/**
 * @author dkruger
 */
public abstract class Shape {
    private float x, y;
    public final float getX() { return x; }
    public final float getY() { return y; }
    public Shape(float x, float y) { this.x = x; this.y = y; }
    public abstract double area();
    public abstract void draw(PApplet p);
}
