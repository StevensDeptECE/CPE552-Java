/**
 *
 * @author dkruger
 */
public class HWIntArray {
  private int[] list;
  private int size;
  
  // if list.length is not > size then no room
  // double the size
  // copy the old memory to the new memory
  private void checkGrow() {
    if (size < list.length)
      return;
    int[] old = list;
    // you write this: list = ...
    // copy the old to the new
    
  }
  
  public int get(int i) {
    if (i >= size)
      throw new ArrayIndexOutOfBoundsException(i);
    return list[i];
  }

  public void add(int v) {
    checkGrow();
    // add the number v to the end of the list
  }
  
  // set the ith element to v
  public void set(int i, int v) {
    
  }
  public String toString() {
        return "return the elements here";
  }

  public static void main(String[] args) {
    final int n = 1000000;
    HWIntArray a = new HWIntArray(n);
    for (int i = 0; i < n; i++)
      a.add(i);
    HWIntArray b = new HWIntArray(1);
    for (int i = 0; i < 20; i++)
      b.add(i);
    b.set(1, 98);
    System.out.append(b); // print all 20 numbers
  }
}
