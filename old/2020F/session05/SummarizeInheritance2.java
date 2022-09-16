public class SummarizeInheritance2 {
    public static void main(String[] args) {
        new Drawable();
        new ScreenShape(10,20); // error, abstract class!
        Drawable[] pts = { new Point(1,2), new Rect(2,5), new Line(2.2f,3.21f), new Point(3, 8)};
        for (int i = 0; i < pts.length; i++)
          pts[i].draw();
        

    }    
}

interface Drawable {
    //    private int x; // NO DATA
    //    private int f() { return 3; }
    //   public Drawable() 
    public void draw(); //abstract method
}

abstract class ScreenShape {
    protected float x,y;
    public ScreenShape(float x, float y) {
        this.x = x; this.y = y;
    }
    public abstract void draw(); //abstract method
}

class Point extends ScreenShape {
    public Point(float x, float y) { 
        super(x,y);
    }
    public void draw() {
        System.out.println("draw point");
    }
}


class Line extends ScreenShape {
    public float x2,y2;
    public Line(float x, float y, float x2, float y2 {
        super(x,y);
        this.x2 = x2;
        this.y2 = y2;
    }
    public void draw() {
        System.out.println("draw point");
    }
}

class Rect extends ScreenShape {
    public float w, h;
    public Rect(float x, float y, float w, float h) { 
        super(x,y);
        this.w = w; this.h = h;
    }
    public void draw() {
        System.out.println("draw point");
    }
    public double area() { return 0; }
}

