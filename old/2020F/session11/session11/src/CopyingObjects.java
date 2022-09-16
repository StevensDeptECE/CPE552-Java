
import java.util.ArrayList;

/**
 *
 * @author dkruger
 */
public class CopyingObjects {
  public static void main(String[] args) {
    int x = 5;
    int y = x; // make a copy
    
    Integer a = 5; //new Integer(5);
    Integer b = a; // does not make a copy
    
    Thing t1 = new Thing(3);
    Thing t2 = new Thing(4);
    Thing t3 = t1; // no copy
    Thing t4 = t1.clone(); // please make me a copy
   
    
    ArrayList<Thing> list1 = new ArrayList<>();
    list1.add(t1);
    list1.add(t2);
    list1.add(t3);
    list1.add(t4);
    for (int i = 0; i < list1.size(); i++)
      System.out.print(list1.get(i) + " ");
    System.out.println();
    
    ArrayList<Thing> list2 = (ArrayList<Thing>)list1.clone(); // shallow copy
    for (int i = 0; i < list2.size(); i++)
      System.out.print(list2.get(i) + " ");
    System.out.println();
    list2.get(0).setX(19);
    
    System.out.println(list1.get(0).x);
  }
}

class Thing implements Cloneable {
  int x;
  public Thing(int x) { this.x = x; }
  
  public void setX(int v) { x = v; }
//  public String toString() { return x +""; }
  public Thing clone() {
    return new Thing(x);
  }
}
