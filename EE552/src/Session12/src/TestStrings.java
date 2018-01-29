
/**
 *
 * @author dkruger
 */
public class TestStrings {
  public static void main(String[] args) {
    String a = "ab" + "c";
    String b = "abc";
    String c = "ab";
    c += 'c';
    
    System.out.println(a == b);
    System.out.println(a == c);
    a = a + 'd';
    
    String text = "This is a test";
    for (int i = 0; i < text.length()-3; i++) {
      System.out.println(text.substring(i, i+4));
      if (text.substring(i, i+4).equals("test")) {
        System.out.println(i);
      }
    }
  }
}
