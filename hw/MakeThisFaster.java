import java.io.*;

public class MakeThisFaster {
	/* Optimize this code by pre-estimating the size of StringBuilder
	 */
	public static void main(String[] args) {
		String s = ""; // "0123456789101112131415...1000000"
		for (int i = 0; i < 1000000; i++)
			s += i;
    try (PrintWriter pw = new PrintWriter(new FileWriter("test.dat"))) {			
			pw.println(s);
		} catch (IOException e ) {
			e.printStackTrace();
		}

	}
}
