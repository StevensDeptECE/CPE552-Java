package session07;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;


import processing.core.*;
/**
 * @author dkruger
 */
public class Processing3d extends PApplet {
    private PShape earth;
    @Override
    public void settings() {
        size(1000,1000, P3D);
    }
    
    public void setup() {
        earth = createShape(SPHERE, 500);        
    }
    public void draw() {
        shape(earth);
    }
    public static void main(String[] args) {
        PApplet.main("session07.Processing3d");
    }
}
