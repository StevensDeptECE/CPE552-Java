package edu.stevens.draw2;

import java.awt.*;

public abstract class Shape {
    protected int x,y;
    Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void setPoint2(int x, int y);
    public abstract void draw(Graphics g);
}
