import java.util.regex.*;


public class RegexTest {
    public static void main(String[] args) {
        String a = "hello there this is   this that   this the other my text 123";
        Pattern p = Pattern.compile("this");

        if (a.matches("this")) {
            System.out.println("Found it!");
        }
        Matcher m = p.matcher(a);
        if (m.matches()) {
            System.out.println("FOund it!");
            String match = m.group();
            System.out.println(match);
        }


    }
}
