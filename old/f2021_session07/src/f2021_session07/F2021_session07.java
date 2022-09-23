import java.io.*;
import java.util.*;
/**
 * @author dkruger
 */
public class F2021_session07 {
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    System.out.print("hello");
    System.out.println(" world"); // prints \n
    PrintWriter pw = new PrintWriter(new FileWriter("test.dat"));
    pw.println("test");
  }
}
