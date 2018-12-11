package session13;

/**
 *
 * @author dkruger
 */
public class S00_Identity {
    public static void main(String[] args) {
       int a = 2;
       int b = 3;
       String s1 = "abc";
       String s2 = s1; // does not make a copy
       // s1 and s2 both point to the same object
       
       System.out.println("s1 == s2: " + (s1 == s2));
       String s3 = "def";
       System.out.println("s1 == s3: " + (s1 == s3));
       String s4 = "a" + "bc";  // "abc"
       System.out.println("s1 == s4: " + (s1 == s4));
       String s5 = "a";
       s5 += "bc";
       System.out.println("s1 == s5: " + (s1 == s5));
       System.out.println("s1.equals(s5): " + s1.equals(s5));
    }
}
