package drawings;

import processing.core.*;
/**
 *
 * @author dkruger
 */
public class DrawEarth extends PApplet {
    private PShape ball;
    private float angle = 0;

    public void settings() {
        size(900, 700, P3D);
        noStroke();
        PImage img = loadImage("earth.jpg");
        //sphereDetail(20); 
        ball = createShape(SPHERE, 240);
        ball.setTexture(img);
        // the larger this number, the better the approximation to a sphere
    }
    public void draw() {
        background(0);   // draw the black of space
        //lights();        // enable lighting
        translate(width/2, height/2); // move to the center
        rotateY(angle); // rotate the earth
        shape(ball);    // draw the earth
        angle += 0.01;  // compute the next angle
    }
    public static void main(String[] args) {
        PApplet.main()
    }
}
