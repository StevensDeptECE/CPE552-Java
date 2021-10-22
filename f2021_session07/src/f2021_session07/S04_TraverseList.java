

public class TraverseList {
  public static void main(String[] args) {
    int[] arr = new int[10];
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();

    ArrayList<Integer> mylist = new ArrayList<>();
    // autoboxing  (automatically creates new Integer(i))
    for (int i = 0; i < 10; i++)
      mylist.add(i);

    // extracting elements by position
    for (int i = 0; i < mylist.size(); i++)
      System.out.println(mylist.get(i) + " ");
    System.out.println();

    for (Integer i : mylist)
      System.out.println(i + " ");
    System.out.println();
  }
}
