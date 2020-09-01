
import java.io.*;

/**
 *
 * @author dkruger
 */
public class FileIO {
    public static void readFile() {
        try {
           FileReader fr = new FileReader("test.dat"); 
           BufferedReader br = new BufferedReader(fr);
           String line;
           
           while ((line = br.readLine()) != null) {
               // add this to your editor
               System.out.println(line);
           }
           br.close();
        } catch (Exception e) { 
           e.printStackTrace(); 
        }        
    }
    public static void writeFile() {
        try {
            PrintWriter p = new PrintWriter(new FileWriter("test.out"));
            p.println("testing 123");
            p.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        readFile();
        writeFile();
    }
}
