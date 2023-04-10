import java.util.regex.*;
public class Parsing {
    public static void main(String[] args) {
        Pattern p = Pattern.compile(
                "public\\s+class\\s+([a-zA-Z][a-zA-Z0-9]*)"
        );
        String s = "public class A\n" +
        "public     class B123    {}\n" +
        "publicclass C{}\n";
        Matcher m = p.matcher(s);
        int start = 0;
        while (m.find(start)) {
            System.out.println("Found" + m.group(0));
            System.out.println(" name=" + m.group(1));
            //inefficient! s = s.substring(m.end());
            start = m.end();
        }
    }
}
