import java.io.*;

public class ExecuteProcesses {
    public static void main(String[] args) throws Exception  {
       Runtime r = Runtime.getRuntime();
       //r.exec("rm filename.txt");

       Process p = r.exec("javac " + "BadJava.java");
       InputStream is = p.getInputStream();
//https://stackoverflow.com/questions/9548232/how-to-get-stdout-and-stderr-in-runtime-exec-in-real-time
//+100  for making code compile from your editor.
//+100  if you also make it go to next error

//http://www.javaquizplayer.com/examples/text-editor-using-java-example.html




    }
}
