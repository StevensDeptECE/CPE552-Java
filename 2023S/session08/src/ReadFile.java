import java.io.*;

public class ReadFile {
    public static void main(String[]args) {
        try {
            FileReader fr = new FileReader("test.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;

            while ( (line= br.readLine()) != null) {
                System.out.println(line);


            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
