import java.util.regex.*;
import java.io.*;
/**
 *
 * @author dkruger
 */
public class RegexParser {
  final static Pattern structPattern = Pattern.compile("struct\\s+([A-Za-z_][a-zA-Z_0-9]*)\\s*\\{");
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new FileReader(args[0]));
    String line;
    while ((line = br.readLine()) != null) {
     Matcher m = structPattern.matcher(line);
      if (m.find()) {
        System.out.println("STRUCT " + m.group(1));
        continue;
      }
      
    }
    
  }
}
