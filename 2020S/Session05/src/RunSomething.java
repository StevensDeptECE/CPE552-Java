import java.io.*;
/**
 *
 * @author dkruger
 */
public class RunSomething {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        try {
            Process p = r.exec("javac");
            var stdout = p.getInputStream();
            InputStreamReader isr = new InputStreamReader(stdout);
            BufferedReader br = new BufferedReader(isr);
            String line = null;
            while ( (line = br.readLine()) != null) {
                System.out.println(line);
            }            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
