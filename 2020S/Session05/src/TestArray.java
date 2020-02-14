/**
 *
 * @author dkruger
 */
public class TestArray {
    public static void main(String[] args) {
        Object obj = new Object(); // parent of all objects
        int x = 2; // not an object
        int[] a = null;
        //Error:        a[0] = 5;
         a = new int[100]; // a is an object
        int[] b = new int[10];
         a[0] = 99;
         a[1] = -1;
         a[99] = 22;
         //ILLEGAL: out of bounds a[100] = 1;
        for (int i = 0; i < a.length; i++)
            a[i] = 9;
    }
}
