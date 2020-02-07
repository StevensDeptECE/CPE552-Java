import processing.core.*;

/**
 *
 * @author dkruger
 */
public class LoadMap extends PApplet {
    private PImage img;
    public void settings() {
        size(1000,800);
        img = loadImage("earth.jpg");
    }
    public void setup() {
        background(255,0,0);
    }
    public void draw() {
        image(img, 0,0);
    }
    public static void main(String[] args) {
        PApplet.main("LoadMap");
    }
}
