package session11;

import java.awt.Graphics;

/**
 *
 * @author dkruger
 */
public class Rect extends Shape implements java.io.Serializable {
    protected int w, h;
    public Rect(int x, int y, int w, int h) {
        super(x,y);
        this.w = w;
        this.h = h;
    }
    @Override
    public void draw(Graphics g) {
       g.drawRect(x, y, w, h);
    }
    public void setSize(int w, int h) {
        this.w = w; this.h = h;
    }
}
