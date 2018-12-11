package session09;

import java.io.*;
import java.util.regex.*;
/**
 *
 * @author dkruger
 */
public class ParseJava {
    public static void main(String[]args) {
        Pattern p = Pattern.compile("(class|interface)\\s+([a-zA-Z_][0-9A-Za-z_\\$]+)");
        try {
            BufferedReader br = new BufferedReader(new FileReader("TestJava.java"));
            String line;
            while  ((line = br.readLine()) != null) {
                Matcher m = p.matcher(line);
                if (m.matches()) {
                    System.out.println(m.start() + "," + m.end());
                    System.out.println(m.group(2));
                }
            }    
        } catch(Exception e) {
            System.out.println("Sorry, can't do it!");
            e.printStackTrace();    
        }
        
    }
}
