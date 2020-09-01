package session06;

/**
 * @author dkruger
 */
public class IntArrayList {
    private int[] a;
    private int used;
    private final void grow() {
        int[] old = a;
        a = new int[old.length*2];
        for (int i = 0; i < old.length; i++)
            a[i] = old[i];
    }
    public IntArrayList() {
        this(1);
    }
    public IntArrayList(int initialCapacity) {
        a = new int[initialCapacity];
        used = 0;
    }
    public void add(int v) {
        if (used >= a.length) {
            grow();
        }
        a[used++] = v; // a[used] = v; used++;
    }
    public String toString() {
        StringBuilder b = new StringBuilder(used * 10);
        for (int i = 0; i < used;i++)
            b.append(i).append(' ');
        return b.toString();
/* BAD IDEA!!!
        String s = "";
      for (int i = 0; i < used; i++)
          s = s + a[i] + " ";
      return s;
*/
    }
    public static void main(String[] args) {
        long t0 = System.nanoTime();
        IntArrayList a = new IntArrayList(1000);
        for (int i = 0; i < 1000000; i++)
            a.add(i);
        long t1 = System.nanoTime();
        System.out.println(t1-t0);
        //System.out.println(a);
    }
}
