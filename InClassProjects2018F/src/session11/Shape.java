package session11;

import java.awt.Graphics;

/**
 *
 * @author dkruger
 */
public abstract class Shape implements java.io.Serializable {
    protected int x,y;
    public Shape(int x, int y) { this.x = x; this.y = y; }
    public abstract void draw(Graphics g);
    public abstract void setSize(int w, int h);
}
