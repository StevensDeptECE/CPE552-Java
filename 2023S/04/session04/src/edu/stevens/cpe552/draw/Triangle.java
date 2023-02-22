package edu.stevens.cpe552.draw;

// classname extends abstractclass
// classname implements interfacename

import java.awt.*;

public class Triangle extends Shape {
    private int x2,y2, x3,y3;

    public Triangle(int x, int y, int x2, int y2, int x3, int y3) {
        super(x,y);
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }
    @Override public void paint(Graphics g) {
        g.drawLine(x,y, x2,y2);
        g.drawLine(x2,y2, x3,y3);
        g.drawLine(x3,y3, x,y);
    }
}
