package session09;

/**
 * @author dkruger
 */
public class CollectionPractice {
    public static ArrayList<Integer> f1(int n) {
       ArrayList<Integer> a = new ArrayList<>();
       for (int i = 0; i < 1000000; i++)
           a.add(i);
       System.out.println(a.size());
    }
    // add the elements of the list
    public static long sum(ArrayList<Integer> x) {
        
    }
    public static void main(String[] args) {
        final int n = 1000000;
        long t0 = System.nanoTime();
        ArrayList<> a = f1(n);
        long t1 = System.nanoTime();
        System.out.println("Arraylist Creating n elements " + t1-t0);

        // Do the same for an arraylist which is preallocated to n elements
        
        // Do the same for DoubleList
        
        System.out.println(sum(a));
    }
}
