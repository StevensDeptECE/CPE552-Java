import java.util.ArrayList;
import java.util.HashMap;
/**
 * @author dkruger
 */
public class CollectionPractice {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(5); // internally new Integer(5)     autoboxing
        a.add(3);
        a.set(0, a.get(0) + 1);
        ArrayList<Elephant> b = new ArrayList<>();
        b.add(new Elephant("Fred"));
        b.add(new Elephant("Alice"));
        
        for (Elephant e : b) {
            System.out.println(e);
        }
        
        
    }
}

class Elephant {
  private String name;
  public Elephant(String n) { name  = n;}
  public String toString() { return "Elephant " + name; }
}

