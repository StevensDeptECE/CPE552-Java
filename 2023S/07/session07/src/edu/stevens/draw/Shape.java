package edu.stevens.draw;

import java.awt.*;

public abstract class Shape {
    protected int x,y;
    Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public abstract void draw(Graphics g);
}
