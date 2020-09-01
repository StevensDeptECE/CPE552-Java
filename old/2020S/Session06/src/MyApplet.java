import processing.core.*;
import java.util.*;
/**
 *
 * @author dkruger
 */

class Body {
    //private PShape sphere
    // load the texture and attach to sphere
   public void draw(PApplet p) {   
       //p.rect();
       //p.shape()      
       
   }
}
public class MyApplet extends PApplet {
// your solar system should contain a list of bodies    
//    private ArrayList<Body>
    public void settings() {
        size(1000,1000);
  //      b1 = new Body("Earth", "earth.jpg", 400);
  //      b2 = new Body("Moon", "moon.jpg", 100);
    }
    
    public void setup() {
        fill(255,0,0);
    }
    
    public void draw() {
        rect(0,0, 100,100);
        //b1.draw(this);
        // translate so tehy don't draw on top of each other!!!
        //b2.draw(this);
    }
    public static void main(String[] args) {
        PApplet.main("MyApplet");
    }
}
