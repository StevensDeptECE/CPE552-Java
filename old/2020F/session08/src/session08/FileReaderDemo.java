package session08;
import java.io.*;

/**
 *
 * @author dkruger
 */
public class FileReaderDemo {
  public static void main(String[] args) {
    try {
    FileReader fr = new FileReader("test.txt");
    BufferedReader br = new BufferedReader(fr);
    String line;
    while ( (line = br.readLine()) != null) {
      System.out.println(line);
      String[] words = line.split("[\\s,\\-\\.\\?]+");
      for(String w : words) {
        System.out.println("[" + w + "]");
      }
      System.out.println();
    }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
