package edu.stevens.s11;

/**
 * @author DovKr
 */
public class S11 {
    public static void main(String[] args) {
      int x = 3;
      int y = 3;
      if (x == y) {
        
      }
      Integer i1 = new Integer(3);
      Integer i2 = 3;
      if (i1 == i2) { // is i1 the same object as i2?
         // NO 
      }
      // identity: location in memory
      if (i1.equals(i2)) {
        // YES
      }
      
      String s1 = "abc";
      
      if (i1.equals(s1)) {
        // OF COURSE NOT!
      }
      
      String s2 = "abc";
      if (s1 == s2) {
        // YES
        
      }
      String s3 = "ab"+ "c"; // "abc"
      String s4 = "ab";
      s4 += "c";
      if (s4 == s3) {
        // NO
      }
      
      // String is IMMUTABLE
      
      
      
      
    }
}
