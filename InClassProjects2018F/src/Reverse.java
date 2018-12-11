/**
 *
 * @author dkruger
 */
public class Reverse {
    public static String reverse(String x) {
        String temp = "";
        for (int i = 0; i < x.length(); i++)
            temp = x.charAt(i) + temp;
        return temp;
    }
    public static void main(String[] args) {
        String a = "this is a test";
        String hold = a;
        System.out.println(a.hashCode());
        a = reverse(a); 
        System.out.println(a);
        System.out.println(a.hashCode());
        System.out.println(a.equals(hold));
        System.out.println(a == hold);
        
    }
}
