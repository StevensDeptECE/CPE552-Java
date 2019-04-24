package sessionobjectorientedbasics;

/**
 *
 * @author dkruger
 */
public class Stringies {
    public static void main(String[] args) {
        // Strings are IMMUTABLE
      String s1 = "abc";
      String s2 = "abc";
      System.out.println(s1 == s2); // special case! optimization
      System.out.println(s1.equals(s2));
      s2 = s2 + "d";
      System.out.println(s1 == s2); // definite false! "abc" cannot be the same object "abcd"
      String s3 = "a" + "bc";
      System.out.println(s1 == s3);
      System.out.println(s1.equals(s3));
      String s4 = "a";
      s4 += "bc";
      System.out.println(s1 == s4); // false
      System.out.println(s1.equals(s4)); // true
        
    }
}
