package sessionobjectorientedbasics;

/**
 * @author dkruger
 */
public class Identity {
    public static void main(String [] args) {
      Integer i1 = new Integer(5);
      Integer i2 = i1;
      Integer i3 = new Integer(5);
      // i2 and i1 both point (refer) to the same object
      System.out.println(i1);
      Object obj = new Object();
      Object obj2 = obj;
      System.out.println(obj);
      System.out.println(obj2);
      Object obj3 = new Object();
      System.out.println(obj3);
      
      System.out.println(i1 == i2);
      System.out.println(i1 == i3);
      System.out.println(i1.equals(i3));
      
        
        
    }
    
}
