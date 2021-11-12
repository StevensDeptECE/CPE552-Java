/**
 *
 * @author dkruger
 */
public class DoubleList {
  private double[] vals;// list of values
  private int used; // the number in the list that are used
  private void checkGrow() {
      if (used < vals.length)
          return;
      // you write this...
  }
  public DoubleList(int capacity) {
      vals = new double[capacity];
      used = 0;
  }
  public void add(double v) {
      checkGrow(); // you write grow to double the size of the array
      vals[used] = v;
      used++;
  }
  public void addStart(double v) {
    // optional   
  }
  public void set(int i, double v) {
     // put a value into the list at position i   
  }
  public double get(int i) {
    return vals[i];
  }
  public int size() {
    // return the size of the list   
  }
  
  public static void main(String[] args) {
    DoubleList a = new DoubleList(1000000);
    
    for (int i = 0; i < a.size(); i++)
        a.set(i, i+0.5);
    //a.addStart(0.8);
    double sum = 0;
    for (int i = 0; i < a.size(); i++)
        sum += a.get(i);
    System.out.println(sum);
  }
}
