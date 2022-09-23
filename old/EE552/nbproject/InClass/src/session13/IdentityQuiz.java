package session13;

/**
 * @author dkruger
 */
public class IdentityQuiz {
    public static void main(String[] args) {
      int a = 2;
      Integer i1 = a; // new Integer(a)
      System.out.println(i1 == a); // i1.intValue() == a
      System.out.println(i1.equals(a));
      int b = i1;
      System.out.println(a == b); // 2 == 2 TRUE
      String c = "abc";
      String d = "ab" + "d";
      System.out.println(c == d);
      System.out.println(c.equals(d));
      d = d.substring(0, 2) + "c";
      System.out.println(d);
      System.out.println(c.equals(d));
      
      int[] m = {1, 2, 3};
      int[] n = {1, 2, 3};
      System.out.println(m==n);
      System.out.println(m.equals(n));
    }
    
}
