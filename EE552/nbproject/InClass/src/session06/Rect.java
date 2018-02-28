package session06;
import static java.lang.Math.*;
/**
 *
 * @author dkruger
 */
public class Rect extends Shape2D {
  private int x2,y2;
          
  public Rect(int x, int y, int w, int h) {
    super(x,y); 
    x2 = x + w;  y2 = y + h;
  }
  public String toString() {
    return super.toString() + ", w=" + (x2-getX()) + " h=" + (y2-getY());
  }
  public double area() { return abs((x2-getX())*(y2-getY())); }
  public int getW() { return abs(x2 - getX()); }
  public int getH() { return abs(y2 - getY()); }
}
