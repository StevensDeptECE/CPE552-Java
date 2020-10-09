package edu.stevens.cpe552.draw;

import java.awt.*;
/**
 *
 * @author dkruger
 */
public abstract class Shape {
    float x,y;
    public Shape(int x, int y) { this.x = x; this.y = y; }
    public abstract void setSecondPoint(int x, int y);
    public abstract void draw(Graphics g);
}
