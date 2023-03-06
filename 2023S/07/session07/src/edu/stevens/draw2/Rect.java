package edu.stevens.draw2;

import java.awt.*;
public class Rect extends Shape {
    private int w, h;
    public Rect(int x, int y, int w, int h) {
        super(x,y);
        this.w = w;
        this.h = h;
    }
    public void setPoint2(int x, int y) {
        w = Math.abs(x - this.x);
        h = Math.abs(y - this.y);
    }
    public void draw(Graphics g) {
        g.drawRect(x, y, w, h);
    }

}
