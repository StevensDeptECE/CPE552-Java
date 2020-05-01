/**
 *
 * @author dkruger
 */
public class Identity {
    public static void main(String [] args) {
        Double d1 = 5.0;
        Double d2 = 5.0;
        System.out.println("d1==d2 " + (d1 == d2));
        System.out.println("d1.equals(d2)=" + d1.equals(d2));
        String s = "abc";
        String s2 = s;
        System.out.println(s == s2);
        System.out.println(s.equals(s2));
        s2 = "abc";
        System.out.println(s == s2); // this is true because the compiler optimizes "abc"
        System.out.println(s.equals(s2));
        String s3 = "ab";
        s3 += "c";
        System.out.println(s == s2); // this is true because the compiler optimizes "abc"
        System.out.println(s.equals(s2));
        
        d2 = d1;
        System.out.println("d1=d2" + (d1==d2));
        System.out.println("d1.equals(d2)=" + (d1.equals(d2)));
        
    }
}
