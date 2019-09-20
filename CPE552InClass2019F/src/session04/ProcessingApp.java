package session04;
import processing.core.*;
/**
 * @author dkruger
 */
public class ProcessingApp extends PApplet {
    public void settings() {
       size(1000,1000); 
    }
    public void draw() {
        line(0,0, 200,200);
    }
    public static void main(String[] args) {
       PApplet.main("session04.ProcessingApp");
    }
}
