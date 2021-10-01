import processing.core.*;
import java.util.*;
import static java.lang.Math.*;

public class ProcessingDraw extends PApplet {
	private ArrayList<Shape> shapes;
	public void settings() {  // void setup()
    size(800,800);
		shapes = new ArrayList<>();
		shapes.add(new Circle(200,100,50));
		shapes.add(new Rect(300,200,30,50));
	}
	public void draw() {
    //for (int i = 0; i < shapes.size(); i++) {
    //  shapes.get(i).draw( this );
		//}
		for (Shape s : shapes) {
			s.draw(this);
		}
	}
	public void mousePressed() {
		shapes.add(new Rect(mouseX, mouseY, 50, 50));
	}
	public static void main(String[] args) {
		PApplet.main("ProcessingDraw"); 
	}
}

abstract class Shape {
  abstract public void draw(PApplet p);
	abstract public double area();
}

class Rect extends Shape {
	private float x, y, w, h;
	public Rect(float x, float y, float w, float h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}
	public void draw(PApplet p) {
    p.rect(x, y, w, h);
	}
	public double area() { return w * h; }
}

class Circle extends Shape {
	private float x, y, r;
	public Circle(float x, float y, float r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}
	public void draw(PApplet p) {
		p.circle(x, y, r);
	}
	public double area() {
		return PI *  r*r;
	}
}
