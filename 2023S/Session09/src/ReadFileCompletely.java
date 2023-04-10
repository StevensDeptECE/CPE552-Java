import java.io.*;
public class ReadFileCompletely {
    public static String readCompletely(String filename) throws IOException {
        File f = new File(filename);
        int len = (int)f.length();
        char c[] = new char[len];
        FileReader fr = new FileReader(f);
        fr.read(c);
        String s = new String(c);
        return s;
        //TODO: this does not work properly for unicode, too many characters at the end?
    }

    public static void main(String[] args) throws Exception {
        String test1 = readCompletely("test.txt");
        System.out.println(test1);
        String test2 = readCompletely("test2.txt");
        System.out.println(test2);

    }
}
