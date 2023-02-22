package edu.stevens.cpe552.draw;
import java.awt.*;
public abstract class Shape {
    protected int x,y;
    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public abstract void paint(Graphics g);
}
