import java.util.regex.*;
import java.io.*;

/**
 *
 * @author dkruger
 */
public class Regex {
    public static void main(String[] args) throws IOException {
        Pattern p = Pattern.compile("(\\([0-9]{3}\\)|[0-9]{3})[\\.\\-]([0-9]{3})[\\.\\-]([0-9]{4})");
        
       FileReader fr = new FileReader("Input.java");
       BufferedReader br = new BufferedReader(fr);
       String line;
       while (   (line = br.readLine()) != null) {
           Matcher m = p.matcher(line);
           if (m.matches()) {
               System.out.println(line.substring(m.start(), m.end()));
               System.out.println(m.start() + "," +  m.end());
               System.out.println(line.substring(m.start(1), m.end(1)));
               System.out.println(line.substring(m.start(2), m.end(2)));
               System.out.println(line.substring(m.start(3), m.end(3)));
           }
           
       }
        
    }
}
