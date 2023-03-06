package edu.stevens.draw;

// Factory class to create lines
public class LineMode extends DrawMode {

    @Override
    public Shape buildit(int x, int y, int w, int h) {
        return new Line(x, y, x+w, y+h);
    }
}
