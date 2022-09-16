/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package processingheadless;
import processing.core.*;
import processing.pdf.*;
import java.io.*;
/**
 *
 * @author dkruger
 */
public class ProcessingHeadless {
    public static void main(String[] args) {
        final int W = 300, H = 200;
       
        PGraphics g = new PGraphics();
        g.setParent(new PApplet());
        g.setPrimary(false);
        g.setSize(W,H);
        g.beginDraw();
        g.background(0xFF0000);
        g.stroke(0xFFFFFF);
        g.line(0, 0, 1000, 1000);
        for (float x = 0; x <= W; x += 50)
            g.line(x,0, x, H);
        g.fill(0xFF0000);
        g.rect(100, 200, 600, 400);
        g.endDraw();
        String path = System.getProperty("user.dir");
        System.out.println(path);
        g.save(path + "/test.jpg");
        
    }
    
}
