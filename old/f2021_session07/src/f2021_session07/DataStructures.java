import java.util.*;

public class DataStructures {
  public static void buildList1(int n) {
    int[] a = new int[n]; // arrays cannot change size
    for (int i = 0; i < n; i++)
      a[i] = i + 1; // fill with 1,2,3...n
  }
  public static void buildList2(int n) {
    ArrayList<Integer> a = new ArrayList<>(n);
    for (int i = 0; i < n; i++)
      a.add(i + 1); // the list will grow
  }
  public static void buildList3(int n) {
    LinkedList<Integer> a = new LinkedList<>();
    for (int i = 0; i < n; i++)
      a.add(i + 1); // the list will grow
  }

  public static void main(String[] args) {
    final int n = 200000000;
    for (int i = 0; i < 2; i++)
      buildList2(n);

    for (int i = 0; i < 10; i++) {
      long t0 = System.nanoTime();
      buildList2(n);
      long t1 = System.nanoTime();
      System.out.println(t1 - t0);
    }
  }
}
