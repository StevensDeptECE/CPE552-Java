package session06.v2;
import processing.core.*;
import java.util.*;
/**
 * @author dkruger
 */
public class Drawing extends PApplet {
    ArrayList<Shape> shapes;
    
    public void settings() {
        size(1000,800);
        shapes = new ArrayList<>();
        shapes.add(new Rect(0,0, 100,100));
        shapes.add(new Circle(300,100, 50));
        shapes.add(new Rect(200,400, 300,100));
    }
    public void draw() {
        for (int i = 0; i < shapes.size(); i++)
            shapes.get(i).draw(this);
    }
    @Override
    public void mousePressed() {
        shapes.add(new Circle(mouseX, mouseY, 20));
    }
    public static void main(String [] args) {
        PApplet.main("session06.v2.Drawing");
    }
}
