
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author dkruger
 */
public class S05ReadFile {
    public  static void main(String[] args) throws FileNotFoundException {
       Scanner s = new Scanner(new BufferedReader( new FileReader("test.txt"))); 
       while (s.hasNext()) {
           String firstName = s.next();
           String lastName = s.next();
           double grade = s.nextDouble();
           System.out.println(firstName + ", " + lastName + ", " + grade);
       }
    }
}
