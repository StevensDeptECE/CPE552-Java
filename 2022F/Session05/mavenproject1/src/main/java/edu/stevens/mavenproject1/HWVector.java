package edu.stevens.mavenproject1;
// change the package to your name (lowercase)
// change the author to your name
// cite any help you get
/**
 * @author DovKr
 */
public class HWVector {
  public static void main(String[] args) {
    Vector v1 = new Vector(1.0, 2.5, 3.0); 
    Vector v2 = new Vector(2.0, -2.2, 1.2);
    Vector v3 = v1.add(v2);
    Vector v4 = Vector.add(v1, v2);
    Vector v5 = v2.scale(3.0); // multiply x,y,z by scale
    double len = v5.abs(); // distance to (0,0,0)
    // print it all
    
  }
}
