package session13;

import java.util.ArrayList;

/**
 *
 * @author dkruger
 */
public class Immutable {
    public static void buildArrayList(int n) {
        ArrayList<Integer> a = new ArrayList<>(n); 
        for (int i = 0; i < n; i++)
            a.add(i);
        for (int i = 0; i < n; i++) {
            a.set(i, a.get(i) + 1);
        }
    }
    public static void buildArray(int n) {
        int[] a = new int[n]; 
        for (int i = 0; i < n; i++)
            a[i] = i;
        for (int i = 0; i < n; i++) {
            a[i]= a[i]+1;
        }
    }
    
    /*
      int a = 2; // 4 bytes
    
      Integer a = new Integer(2)
      // variable is 4 bytes   Integer = 16 bytes
    */
    
    public static void main(String[] args) {
        final int n = 50000000;
        buildArray(10000);
        long t0 = System.nanoTime();
        buildArray(n);
        long t1 = System.nanoTime();
        System.out.println((t1-t0)*1e-9);
    }
}
