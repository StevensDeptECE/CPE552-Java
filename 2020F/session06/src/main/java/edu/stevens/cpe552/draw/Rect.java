package edu.stevens.cpe552.draw;
import java.awt.*;
/**
 *
 * @author dkruger
 */
public class Rect extends Shape {
    int w, h;
    
    public Rect(int x, int y, int w, int h) {
        super(x,y);
        this.w = w; this.h = h;
    }
    @Override
    public void setSecondPoint(int x, int y) {
        w = (int)(x - this.x); h = (int)(y - this.h);
    }
    
    @Override
    public void draw(Graphics g) {
        g.drawRect((int)x,(int)y, w, h);
    }
    
}
