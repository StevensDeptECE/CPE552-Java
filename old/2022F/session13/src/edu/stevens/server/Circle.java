package edu.stevens.server;
import java.awt.*;

public class Circle {
    private double x, y, r;
    private Color c;

    public Circle() { x= y = r = 0; }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Color getC() {
        return c;
    }

        public void setC(Color c) {
            this.c = c;
        }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
