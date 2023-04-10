import java.util.*;

public class HWLists {
    private  static Random r; // HWLists.r
    // construct an array of n random strings of length m, in any language
    // buildArrayListOfStrings(5, 4)
    // "hell", "amdq", "lpqd", "1251", "x15p"
    public static ArrayList<String> buildArrayListOfRandomStrings(int n, int m) {
        char c = (char) r.nextInt(65536); // random char
        // better: Pick a character that is visible (look it up)
        //https://home.unicode.org/

        String s = new String();
        s = s + 'x'; // append (bad)

        StringBuilder b = new StringBuilder(m);
        //...
        b.toString();

        //most efficient
        char [] chars = new char[m];//????
        String s2 = new String(chars);
        return null; //TODO:
    }
    public static ArrayList<Integer> buildBigArraySlow(int n) {
        ArrayList<Integer> big = new ArrayList(n);
        for (int i = 0; i < n; i++)
            big.set(i, i);
        for (int i = 0; i < n; i++)
            big.set(i, big.get(i) + 1);
        return big;
    }

    public static int[] buildBigArrayFast(int n) {
        return null;
    }

    public static void main(String[] args) {
        r = new Random(0);

        ArrayList<String> a = buildArrayListOfRandomStrings(10, 30);
        //TODO: print(a); // write a function to print out all the strings

        ArrayList<Integer> intList = null; // TODO: buildArrayListOfRandomIntegers(20);
        for (int b : intList) {
            System.out.print(b + " ");
        }
        final int n = 1000000;
        long t0 = System.nanoTime();
        buildBigArraySlow(n);
        long t1 = System.nanoTime();
        System.out.println("Big Slow Elapsed: " + (t1 - t0) * 1e-9);
        t0 = System.nanoTime();
        //TODO: int[] a = buildBigArrayfast(n);
        t1 = System.nanoTime();
        System.out.println("Big Fast Elapsed: " + (t1 - t0) * 1e-9);
    }
}
