package edu.stevens.draw2;

public class RectMode extends DrawMode {
    @Override
    public void press(int x, int y) {
         current = new Rect(x,y,1,1);
    }

    @Override
    public void release(int x, int y) {
        current.setPoint2(x,y);
    }
}
