
import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author dkruger
 */
public class SortElephants {
  public static void main(String[] args) {
    Elephant[] elephants = { new Elephant("Ophilia", 21), new Elephant("Fred", 28), new Elephant("Alice", 6), new Elephant("Bob", 2)};
//    Arrays.sort(elephants);
    for (Elephant e : elephants)
      System.out.print(e + " ");
    System.out.println();
    Arrays.sort(elephants, new ElephantCompareByName());
    for (Elephant e : elephants)
      System.out.print(e + " ");
    System.out.println();
  }
  
}

class ElephantCompareByName implements Comparator<Elephant> {

  @Override
  public int compare(Elephant a, Elephant b) {
    return a.name.compareTo(b.name);
  }
  
}

class ElephantCompareByAge implements Comparator<Elephant> {
  @Override
  public int compare(Elephant a, Elephant b) {
    return a.age - b.age;
  }
}

class Elephant implements Comparable<Elephant> {
  int age;
  String name;
  public Elephant(String name, int age) { this.name = name; this.age = age; }
  public String toString() { return "Elephant: " + name + " " + age; }

 @Override
  public int compareTo(Elephant t) {
    return age - t.age;
    //return name.compareTo(t.name);
  }
  
}