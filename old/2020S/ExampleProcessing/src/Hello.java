import processing.core.*;
/**
 *
 * @author dkruger
 */
public class Hello extends PApplet {
    public void settings() {
      size(700,700);  
    }
    public void setup() {
        fill(255,0,0);
    }
    
    public void draw() {
        rect(0,0, 100,100);
    }
    
    public static void main(String[] args) {
       PApplet.main("Hello"); 
    }
    
}
