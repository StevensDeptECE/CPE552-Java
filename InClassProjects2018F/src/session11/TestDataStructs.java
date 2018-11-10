import java.util.*;
import java.io.*;

public class TestDataStructs {
	public static void main(String[] args) {
		HashMap<String, String> dict = new HashMap<>( );
    try {		
			BufferedReader br = new BufferedReader(new FileReader("dict.dat"));
			String line;
			while ( (line = br.readLine()) != null) {
				String[] words = line.split("\\s+");
				dict.put(words[0], words[1]);
			}
			Scanner s = new Scanner(System.in);
			String english;
			while (s.hasNext()) {
				english = s.next();
				String italian = dict.get(english);
				if (italian != null)
					System.out.println(italian);
			}
		} catch(Exception e) {
			System.out.println("Failed reading dictionary");
      e.printStackTrace();
		}
	}

}
