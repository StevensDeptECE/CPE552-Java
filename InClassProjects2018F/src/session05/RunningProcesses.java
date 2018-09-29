package session05;

import java.io.IOException;

/**
 *
 * @author dkruger
 */
public class RunningProcesses {
    public static void main(String[] args) throws IOException {
        Runtime r= Runtime.getRuntime();
       
        Process p = r.exec("javac test.java");
       // r.exec("java test");
    }
}
