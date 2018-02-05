
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author dkruger
 */
public class s06_OpenFile {
  public static void main(String[] args)throws Exception  {
//Don't use hardcoded paths!!!  FileReader fr = new FileReader("C:/Myfiles/test.dat")
    FileReader fr = new FileReader("test.dat");
    Scanner s = new Scanner(new BufferedReader(fr));
    String text = s.next();
    double d = s.nextDouble();
    int i = s.nextInt();
    System.out.println(text + "," + d + "," + i);
    s.close();
   }
}
