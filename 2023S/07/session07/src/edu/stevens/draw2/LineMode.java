package edu.stevens.draw2;

// Factory class to create lines
public class LineMode extends DrawMode {

    @Override public void press(int x, int y) {
        current = new Line(x,y,x,y);
    }
    @Override public void release(int x, int y) {
        current.setPoint2(x,y);
    }

}
