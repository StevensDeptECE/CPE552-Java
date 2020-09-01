import java.io.FileReader;
import java.util.Scanner;
/**
 *
 * @author dkruger
 */
public class OpenFile {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(new FileReader("data/solarsystem.dat"));
            while (s.hasNext()) {
                int v = s.nextInt();
                double v2 = s.nextDouble();
                String t = s.next();
            
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}
