package edu.stevens.draw2;

import java.awt.*;

public class Line extends Shape {
    private int x2,y2;
    public Line(int x, int y, int x2, int y2) {
        super(x,y);
        this.x2 = x2; this.y2 = y2;
    }

    public void setPoint2(int x, int y) {
        x2 = x; y2 = y;
    }
    @Override public void draw(Graphics g) {
        g.drawLine(x,y, x2, y2);
    }
}
