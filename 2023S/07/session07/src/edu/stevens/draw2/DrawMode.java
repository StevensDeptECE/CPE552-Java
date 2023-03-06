package edu.stevens.draw2;

public abstract class DrawMode {
    protected Shape current;
    public Shape getCurrent() { return current; }
    public abstract void press(int x, int y);
    public abstract void release(int x, int y);
}
