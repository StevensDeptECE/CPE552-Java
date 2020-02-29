import java.util.*;
import java.io.*;

/**
 * see all the solar system data:
 *https://drive.google.com/open?id=0ByWFfdXuM_awZmgzTS1LTkNyRDQ
 * @author dkruger
 */
public class TestParseFile {
    public static void main(String[] args) throws IOException {
        /*
        BufferedReader br = 
                new BufferedReader(
                        new FileReader("solarsystem.dat"));
        String line; // this is a comment 
        while ( (line = br.readLine()) != null) {
           System.out.println(line); 
        }
*/
/*
        add to previous assignment Solar System
        Read in each line and create a Body object and add to ArrayList


*/
    try {
        Scanner s = new Scanner(
                new BufferedReader(
                        new FileReader("solarsystem.dat")));
        String header = s.nextLine();
        System.out.println(header);
        
        String name = s.next();
        String orbits = s.next();
        double mass = s.nextDouble();
        Object obj = null;
        System.out.println(obj.equals("test"));
    } catch (java.io.FileNotFoundException e) {
        e.printStackTrace();
    }

        //String header = s.nextLine();
        //System.out.println(header);
    }
    
}
