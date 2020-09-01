package session05;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.concurrent.TimeUnit;
import javax.swing.JTextArea;

/**
 *
 * @author dkruger
 */
public class RunningProcesses {
    public static void runProcessUsingProcessBuilder() throws Exception {
        ProcessBuilder builder = new ProcessBuilder("d:/bin/jdk1.8.0_144/bin/javac", "test.java"); 
        Process p = builder.start();
        Thread.sleep(10000);
        int status = p.exitValue();
        System.out.println(status);        
    }
    public static  void exampleTimeStampCheck() {
        // these calls should help for checking files
        File f = new File("test.java");
        long t = f.lastModified();
        //compare the timestamp for test.data against test.class
        // if test.java is more recent, then you need to recompile.  Otherwise report done.
        
        // these calls should help for cut/paste
        JTextArea ta = new JTextArea();
        String text = ta.getSelectedText();
        int start = ta.getSelectionStart();
        int end = ta.getSelectionEnd();
    }
    public static void runProcessUsingRuntime() throws Exception {
        Runtime r= Runtime.getRuntime();
        Process p = r.exec("javac test.java");
        BufferedReader isr = new BufferedReader(new InputStreamReader(p.getErrorStream()));
        String line;
        while ((line = isr.readLine()) != null)
            System.out.println(line);
        int status = p.exitValue();
        System.out.println("Process ran with result: " + status);        
    }
    public static void main(String[] args) throws Exception {
        runProcessUsingRuntime();
    }
}
