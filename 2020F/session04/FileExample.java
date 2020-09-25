import java.io.*;

public class FileExample {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("test.dat"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
