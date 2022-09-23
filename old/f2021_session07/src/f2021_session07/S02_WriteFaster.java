import java.io.*;
import java.util.*;
/**
 * @author dkruger
 */
public class S02_WriteFaster {
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    try {
      PrintWriter pw =
          new PrintWriter(new BufferedWriter(new FileWriter("test.dat")));
      for (int i = 0; i < 10000000; i++)
        pw.println(i);

      // 0
      // 1
      // 2
      // 3
      // 4
      //..
      // 10..
      // 11..
      // 99..
      // 100...
      // 999...
      // 100000
      // 999999\n

      pw.close(); // force remainder of the file to flush VERY IMPORTANT
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
