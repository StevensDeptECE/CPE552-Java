import java.util.*;
/**
 *
 * @author dkruger
 */
public class TestHash {
    static HashMap<String, Body> bodiesByName =
            new HashMap<>();
    static class Body {
        String name;
       double x, y;
       Body(String name, String orbits, double r) {
           this.name = name;
           bodiesByName.put(name, this);
           Body orbitsAround = bodiesByName.get(orbits);
           if (orbitsAround == null) {
           } else {
              //ake your orbit relative to their position
              // compute cx, cy the position of the body you orbit
              // compute a random angle 0 to 2pi
              // x = cx + r * cos(angle), y = cy + r*sin(angle)
           }
       }
    }
    public static void main(String[] args) {
        HashMap<String, String> byName =
                new HashMap<>();
        byName.put("Sun", null);
        byName.put("Earth", "Sun");
        byName.put("Moon", "Earth");
        byName.put("Mars", "Sun");
        byName.put("Phobos", "Mars");
        new Body("Sun", "???", 0);
        new Body("Earth", "Sun", 1e12);
                
        System.out.println(byName.get("Earth"));
        System.out.println(byName.get("Moon"));
        double rand = Math.random(); // random number from 0 to 1.0
    }
}
