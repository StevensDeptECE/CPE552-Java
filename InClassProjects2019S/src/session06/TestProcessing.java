package session06;

import processing.core.*;
/**
 * @author dkruger
 */

// for high-performance graphics, use LWJGL

public class TestProcessing extends PApplet {    
    @Override
    public void settings() {
        size(600,600, P3D);
    }
    public void setup() {
    }
    public void draw() {
        line(0,0, 100,100);
        sphere(400);
    }
    public static void main(String[] args) {
        PApplet.main("session06.TestProcessing");
    }
    
}
