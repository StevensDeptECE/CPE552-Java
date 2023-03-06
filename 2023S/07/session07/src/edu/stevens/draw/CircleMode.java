package edu.stevens.draw;

public class CircleMode extends DrawMode {
    public Shape buildit(int x, int y, int w, int h) {
        return new Circle(x,y,w/2);
    }
}
