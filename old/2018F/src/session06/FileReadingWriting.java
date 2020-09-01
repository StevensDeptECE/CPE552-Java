package session06;

import java.io.*;

/**
 *
 * @author dkruger
 */
public class FileReadingWriting {
    public static void testRead()  throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader("test.dat"));
        String line;
        
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }
    public static void testWrite() throws Exception {
        PrintWriter p = new PrintWriter(new FileWriter("test.out"));
        p.print("testing");
        p.println("this is our output");
        p.close();
    }
    public static void main(String[] args) throws Exception {
        testRead();
        testWrite();
    }
}
