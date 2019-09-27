package session05;
/**
 *
 * @author dkruger
 */
public class Point {
    private int x, y; // integer coordinates of point
    public Point(int x, int yi) {
        this.x = x; y = yi;
    }
    public Point() {
        x = 0; y = 0;
    }
    public String toString() {
        return "(" + x + "," + y + ")";
//        return '(' + x + ',' + y + ")";
    }
    
    public double dist(Point b) {
      final double dx = x-b.x, dy = y-b.y;
      return Math.sqrt(dx*dx + dy*dy);
    }
    
    public static void main(String[] args) {
        Point a = new Point(4,5);
        Point b = new Point(4,4);
        System.out.println(a);
        System.out.println(a.dist(b));
        Point c = new Point();
    }
}
