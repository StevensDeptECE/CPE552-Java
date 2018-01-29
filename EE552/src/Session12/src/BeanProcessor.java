import java.lang.reflect.*;
import java.util.*;
/**
 *
 * @author dkruger
 */
public class BeanProcessor {
  public static void main(String[] args) throws Exception {
    //Scanner s = new Scanner(System.in);
    //String className = s.next();
    //Class c = Class.forName(className);
    Class c = Person.class;
    Method[] methods = c.getMethods();
    ArrayList<String> getters = new ArrayList<>();
    ArrayList<String> setters = new ArrayList<>();
    for (Method m : methods ) {
      String name= m.getName();
      if (name.startsWith("get"))
        getters.add(name);
      else if (name.startsWith("set"))
        setters.add(name);
    }
    HashMap<String,Integer> attributes = new HashMap<>();
    for (String g : getters) {
      attributes.put(g.substring(3), 1);
    }
    for (String s2 : setters) {
      String name = s2.substring(3);
      if (attributes.containsKey(name)) {
        attributes.put(name, 2);
        System.out.println("Attribute: " + name);
      }
    }
  }
}
