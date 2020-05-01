import java.util.*;

/**
 *
 * @author dkruger
 */
public class ListPractice {
  public static void main(String[] args) {
    ArrayList<Integer> a = new ArrayList<>(); 
    for (int i = 0; i < 10; i++)
      a.add(i);
    int j = 0;
    for (int i = 0; i < a.size(); i++)
      if (a.get(i) % 2 == 0) {
        a.set(j, a.get(i));
        j++;
      }
    for (int i = a.size()-1; i>= j; i--)
      a.remove(i);
    for (int i = 0; i < a.size(); i++)
      System.out.print(a.get(i));
    System.out.println();
   
    int b[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    System.out.println(b.length);
    j = 0;
    for (int i = 0; i < b.length; i++)
      if (b[i] % 2 == 0) {
        b[j] = b[i];
        j++;
      }  
    for (int i = 0; i < b.length; i++)      
      System.out.print(b[i]);
    System.out.println();
    
    int [] old = b; // 2 4 6 8 10 6 7 8 9 10
    b = new int[j];
    System.arraycopy(old, 0, b, 0, j);
    
    System.out.println();
    
    LinkedList<Integer> c = new LinkedList<>();
    for (int i = 0; i < 10; i++)
      c.add(i);
    for (Iterator<Integer> i = c.iterator(); i.hasNext(); )
      System.out.print(i.next());
    
  }
}
