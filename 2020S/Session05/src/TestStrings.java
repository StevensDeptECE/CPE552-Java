/**
 *
 * @author dkruger
 */
public class TestStrings {
    public static String addSpaces(String s) {
        // java strings are IMMUTABLE (cannot change)
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            ans += s.charAt(i);
            ans += ' ';
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "this is a test";
        s += "Testing";
        System.out.println(s.charAt(2));
        System.out.println(s.endsWith("in"));
   for (int i = 0; i < a.length; i++)
            a[i] = 9;
        System.out.println(addSpaces(s));
        //t h i s  i s  a  t e s t T e s t i n g
//        System.out.println(removeVowels(s));//ths s  tstTstng
//        System.out.println(reverse(s));//gnitseTtset a si siht
//        System.out.println(replace(s, 'i', 'x')); //thxs xs a testTestxng
    }
}
