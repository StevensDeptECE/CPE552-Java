package session09;
import java.util.regex.*;
/**
 
 * @author dkruger
 */
public class Session09 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    String test1 = "Testing ACT XJQIIOP  testing, += 31 testing 123 where are teh words teacher's pet ";
    
    Pattern p = Pattern.compile("[A-Za-z]+");
    boolean b = test1.matches("Testing.*");
    System.err.println("string match: " + b);
    Matcher m = p.matcher(test1);
    while (m.find()) {
      System.out.println(m.group()); // print out what you matched
      System.out.println(m.start());
      System.out.println(m.end());
      if (m.end() >= test1.length())
        break;
      test1 = test1.substring(m.end()); // Very inefficient
    }
    
    System.out.println("Faster code");
    test1 = "fast, fast, fast. Do not reallocate your string buffer when searching";
    m = p.matcher(test1);
    int start = 0;
    while (m.find(start)) {
      System.out.println(m.group()); // print out what you matched
      System.out.println(m.start());
      System.out.println(m.end());
      start = m.end();
    }
    /*
    Pattern p2 = Pattern.compile("[^,0-9\\-_\\?\\.]+");
    
    Pattern p3 = Pattern.compile("a\\\\b");
    String s = "x\\s+y[^0-9\\-\\.\\,\\?]";
    
    preview feature, does not help for regex anyway. There are no raw strings in Java. Too bad!
  String s3="String s2 = \"abc\";\n";
  String s4 = """
              testing
              testing
              123
              many lines, no extra \n! yay!
              
              """;
    */
    
  }
  
}
