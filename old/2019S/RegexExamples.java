import java.util.regex.*;
import java.io.*;

public class RegexExamples {
	public static void main(String [] args) throws Exception {
		String pat = "[^\\d]-?(2[01]\\d{8}|1\\d{9}|\\d{9})[^\\d]";
		// match \frac{1}{2}
		
		String pat2 = "\\\\frac{1}{2}";
		String email = "\\w+[\\.\\-]?\\w+@\\w+(\\.\\w+)+";
		Pattern p = Pattern.compile(email);
	 
		BufferedReader br = new BufferedReader(new FileReader("test.dat"));
		String line;

		while ( (line = br.readLine()) != null) {
			System.out.println("Input: " + line);
			Matcher m = p.matcher(line);
			boolean b = m.matches();
			if (b)
				System.out.println(line);

		}
		br.close();
	}
}
