/**
 *  Compare time to add elements to your IntList vs. ArrayList<Integer> for 50% bonus on this week's homework.
 * @author dkruger
 */
public class BenchmarkHW {
  public static void main(String[] args) {
    long t0 = System.nanoTime();
    
    long t1 = System.nanoTime();
    System.out.println("Elapsed" + (t1-t0)*1e-9);
  }
  
}
