package edu.stevens.draw2;

public class CircleMode extends DrawMode {
    @Override public void press(int x, int y) {
        current = new Circle(x,y,1);
    }
    @Override public void release(int x, int y) {
        current.setPoint2(x,y);
    }
}
