/**
 *
 * @author dkruger
 */
public class PrimitiveDataTypesAndString {
    public static void main(String[] args) {
       int x = 2;
       long y = -123456789012345678L;
       float f = 2.3f;
       double d = 2.3;
       double d2 = 2.3f;
       float f2 = (float)1.23456789012345; // lose precision, you must cast
       char c = 'a';
       char c2 = '大';
       final double 大 = 1e100;
       final double π = 3.14159265358979;
       //.,;
       boolean b = false;
       b = !b;
       String s = "abc";
       String s2 = s;
       
       int a = 2, a2 = 2;
       if (a == a2) {
           System.out.println("equal");
       }
       
       if (s == s2) {
           System.out.println("Same object");
       }
       String s3 = "abc";
       if (s == s3) {
           System.out.println("Same object");
       }
       String s4 = "ab" + "c";
       String s5 = "ab";
       s5 += "c";
       System.out.println(s == s5);
       
       System.out.println(s.equals(s5));

    }
}
