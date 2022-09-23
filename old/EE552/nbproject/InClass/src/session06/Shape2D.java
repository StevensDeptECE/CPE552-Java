package session06;

/**
 * Abstract base class for all 2d shapes
 * @author dkruger
 */
public abstract class Shape2D {
  private int x, y;
  public Shape2D(int x, int y) { this.x = x; this.y = y; }
  public int getX() { return x; }
  public int getY() { return y; }
  public String toString() {
    return getClass().getSimpleName() + " x=" + x + ", y=" + y; 
  }
  public abstract double area();
}
