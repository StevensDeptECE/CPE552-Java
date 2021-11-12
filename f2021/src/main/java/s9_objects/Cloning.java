package s9_objects;

/**
 *
 * @author dkruger
 */
import java.util.*;

public class Cloning {
    public static void main(String[] args) throws Exception {
        Person p1 = new Person("Dov", "Kruger");
        Person p2 = p1;
        Person p3 = p1.clone();
        p1.setFirstName("Freddy");
        System.out.println("p2=" + p2);
        System.out.println("p3=" + p3);
        
        ArrayList<Integer> list = new ArrayList<>(100);
        for (int i = 0; i < 100; i++)
            list.add(i);
        
        ArrayList<Integer> list2 = (ArrayList<Integer>)list.clone();
        for (int i = 0; i < 10; i++) {
            Integer i1 = list2.get(i);
            Integer i2 = list.get(i);
           
            System.out.println(i1 == i2);
        }
        System.out.println(list == list2);
    }
}

class Person implements Cloneable {
  private String first, last;
  public Person(String fname, String lname ) {
      first = fname; last = lname;
  }
  public Person clone() {
      try {
        return (Person)super.clone();
      } catch (CloneNotSupportedException e) {
          return null;
      }
  }
  
  public void setFirstName(String f) { first = f; }
  
  public String toString() { return first + " " + last; }
}