import java.io.*;
import java.util.*;
/**
 * @author dkruger
 */
public class S03_LetItThrow {
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) throws IOException {
    PrintWriter pw =
        new PrintWriter(new BufferedWriter(new FileWriter("test.dat")));
    for (int i = 0; i < 10000000; i++)
      pw.println(i);
    pw.close(); // force remainder of the file to flush VERY IMPORTANT
  }
}
