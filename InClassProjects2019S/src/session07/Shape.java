package session07;

/**
 *
 * @author dkruger
 */
public abstract class Shape {
    protected int x,y;
    public Shape(int x, int y) {
        this.x = x; this.y = y;
    }
    public abstract void draw(java.awt.Graphics g);
}
