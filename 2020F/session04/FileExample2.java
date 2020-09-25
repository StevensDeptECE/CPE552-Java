import java.io.*;

public class FileExample2 {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new FileWriter("filename.txt"));
        bw.write("Files in Java are tricky");
        bw.write("always remember to call .close()!");
        bw.close();
    }
}
