package edu.stevens.draw;

public class RectMode extends DrawMode {
    public Shape buildit(int x, int y, int w, int h) {
        return new Rect(x,y,w, h);
    }
}
