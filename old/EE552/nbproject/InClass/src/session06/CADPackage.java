package session06;

import java.util.*;
/**
 *
 * @author dkruger
 */
public class CADPackage {
  public static void main(String[] args) {
    Shape3d[] s = new Shape3d[2];
    s[0] = new Sphere(0.0,0.0,0.0,   50.0); // centered on origin, r=50
    s[1] = new Cube(50.0,25.0,12.0,  30.5); // centered on (50,25,12) s=30.5
    s[2] = new Cylinder(10,20,30,    50, 100); // centered at(10,20,30), r=50, h=100
    for (int i = 0; i < s.length; i++) {
      System.out.println(s[i]);
      System.out.println("Volume = " + s[i].volume());
      System.out.println("Bounding Sphere=" +s[i].getBoundingSphere());
      System.out.println("Bounding Cube=" +s[i].getBoundingCube());
    }
    ArrayList<Shape3d> shapes = new ArrayList<>();
    shapes.add(new Sphere(0.0,0.0,0.0,   50.0));
    shapes.add(new Cube(50.0,25.0,12.0,  30.5));
    shapes.add(new Cylinder(10,20,30,    50, 100));
    for (int x = 0; x < shapes.size(); x++) {
      System.out.println(shapes.get(x));
    }
    for (Shape3d x : shapes) {
      System.out.println(x + ": volume=" + x.volume());
    }
  }
}







