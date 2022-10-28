package edu.stevens.mavenproject1;
import processing.core.PApplet;
/**
 * @author DovKr
 */
public class UsingProcessing extends PApplet {
  private int x,y;
  public void settings() {
    size(1024,1024);
  }
  public void draw() {
    // do your own graphics anything cool
    circle(x, y, 50);
    x++;
  }
  
  public static void main(String[] args) {
    System.out.println("WE are here!");
    PApplet.main("edu.stevens.mavenproject1.UsingProcessing", new String[]{""});
  }
}
