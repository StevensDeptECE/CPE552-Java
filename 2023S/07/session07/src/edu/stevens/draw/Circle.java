package edu.stevens.draw;

import java.awt.*;

public class Circle extends Shape {
    private int r;
    public Circle(int x, int y, int r) {
        super(x,y);
        this.r = r;
    }
    @Override public void draw(Graphics g) {
        g.drawOval(x, y, 2*r, 2*r);
    }
}
