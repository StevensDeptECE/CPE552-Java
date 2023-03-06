package edu.stevens.draw;

import java.awt.*;
public class Rect extends Shape {
    private int w, h;
    public Rect(int x, int y, int w, int h) {
        super(x,y);
        this.w = w;
        this.h = h;
    }
    public void draw(Graphics g) {
        g.drawRect(x, y, w, h);
    }

}
