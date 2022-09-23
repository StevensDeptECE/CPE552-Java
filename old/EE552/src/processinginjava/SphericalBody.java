/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package processinginjava;
import processing.core.*;
import processing.opengl.*;

/**
 *
 * @author dkruger
 */
public class SphericalBody {
    private String name;
    private PShape body;
    private PShape atmosphere;
    private static PShader bodyShader;
    private static PShader atmosphereShader;
    static {
        bodyShader = null;
        atmosphereShader = null;
    }
    public SphericalBody(String name, PApplet p) {
        if (bodyShader == null) {
            bodyShader = p.loadShader("SphericalBodyFrag.glsl", "SphericalBodyVert.glsl");
            bodyShader.set("texMap", p.loadImage(name + ".jpg"));
            bodyShader.set("bumpMap", p.loadImage(name + "bump.jpg"));
            bodyShader.set("specularMap", p.loadImage(name + "spec.jpg"));
            bodyShader.set("bumpScale", 0.05f);
        }
        atmosphereShader = p.loadShader("AtmosphereFrag.glsl", "AtmosphereVert.glsl");
        atmosphereShader.set("texMap", p.loadImage(name + "atmosphere.jpg"));
        atmosphereShader.set("alphaMap", p.loadImage(name + "atmospheretrans.jpg"));
    }
    
}
