import java.io.*;
import java.util.concurrent.TimeUnit;

public class RunningProcesses {
    public static void runProcessUsingProcessBuilder() throws Exception {
        ProcessBuilder builder = new ProcessBuilder("d:/bin/jdk1.8.0_144/bin/javac", "test.java"); 
        Process p = builder.start();
        Thread.sleep(10000);
        int status = p.exitValue();
        System.out.println(status);        
    }
    
    public static void runProcessUsingRuntime() throws Exception {
        Runtime r= Runtime.getRuntime();
        Process p = r.exec("javac test.java");
	//        Process p = r.exec("d:/bin/jdk1.8.0_144/bin/javac test.java");
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
