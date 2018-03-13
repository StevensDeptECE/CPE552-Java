package session07;

import java.lang.reflect.*;
import java.util.*;
/**
 *
 * @author dkruger
 */
public class UsingReflection {
  public static void main(String[] args) {
    PersonBean p = new PersonBean("Dov", "Kruger", 50);
    Class c = p.getClass();
    System.out.println(c.getName());
    System.out.println(c.getSimpleName());
    
    Method[] m = c.getMethods();
    if (m == null)
      System.exit(0);
/*
    // print out all public methods in the class
for (int i = 0; i < m.length; ++i)
      System.out.println(m[i].getName());    
*/    

HashSet<String> get = new HashSet<>();
HashSet<String> set = new HashSet<>();
// print out all methods that start with either "set" or "get"
for (int i = 0; i < m.length; ++i) {
  String name = m[i].getName();
  if (name.startsWith("get"))
    get.add(name.substring(3));
  else if (name.startsWith("set")) {
    set.add(name.substring(3));
  }
}    

for (String g : get) {
  if (set.contains(g) )
    System.out.println(g);
}
    
    
    

  }
}
