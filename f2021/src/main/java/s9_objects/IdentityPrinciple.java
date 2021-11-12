package s9_objects;

/**
 *
 * @author dkruger
 */
public class IdentityPrinciple {
    public static void main(String[] args) {
      int a = 3;
      int b = 4;
      System.out.println(a == b);
      Integer i1 = 5;//new Integer(5);
      Integer i2 = 5;
      System.out.println(i1 == i2); // different objects
      System.out.println(i1.equals(i2)); // true!

      // in object oriented programming languages, identity=memory addr
      
      String s1 = "abc";
      String s2 = "abc";
      System.out.print(s1==s2);
      System.out.println(s1.equals(s2));
      
      String s3 = "ab" + "c";
      String bigString = "this is a very long" +
              "string spanning multiple lines" + 
              "you are not allowed to have a string containing newline";
      String s4 = "ab";
      s4 += "c";
      System.out.println(s1 == s4);
      System.out.println(s1.equals(s4));
    }
}
