import java.io.*;
import java.util.*;
/**
 * @author dkruger
 */
public class S01_WriteFile {
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    try {
      System.out.print("hello");
      System.out.println(" world"); // prints \n
      PrintWriter pw = new PrintWriter(new FileWriter("test.dat"));
      pw.println("Hello㒰 㒱 㒲 㒳 㒴 㒵 㒶 㒷 㒸 㒹 㒺? This is a test");
      pw.close(); // force remainder of the file to flush VERY IMPORTANT
    } catch (IOException e) {
      System.out.println(e);
      e.printStackTrace();
    }
  }
}
