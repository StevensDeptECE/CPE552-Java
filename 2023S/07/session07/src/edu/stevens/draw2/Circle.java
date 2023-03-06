package edu.stevens.draw2;

import java.awt.*;

public class Circle extends Shape {
    private int r;
    public Circle(int x, int y, int r) {
        super(x,y);
        this.r = r;
    }
    public void setPoint2(int x, int y) {
        r = Math.max(x-this.x, y-this.y)/2;
    }
    @Override public void draw(Graphics g) {
        g.drawOval(x, y, 2*r, 2*r);
    }
}
