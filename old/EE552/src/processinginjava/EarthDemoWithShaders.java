/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package processinginjava;
import java.util.ArrayList;
/**
 *
 * @author dkruger
 */
public class EarthDemoWithShaders extends PApplet {
    private ArrayList<SphericalBody> bodies;
    private double dt;
    public EarthDemoWithShaders() {
        bodies = new ArrayList<>();
        dt = 1;
    }
    
    public void settings() {
        size(1000,1000, P3D);
        bodies.add(new Body("earth1k"));
    }
    
    public void draw() {
        background(0);
        for (SphericalBody b : bodies) {
            b.draw(this);
        }
    }
    
}
