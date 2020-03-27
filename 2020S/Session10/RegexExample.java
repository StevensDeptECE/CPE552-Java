import java.util.regex.*;

public class RegexExample {
	public static void main(String[] args) {
		String s = "Search me I'm a pattern! I like a good drink now and then...what do we have?";
		Pattern p = Pattern.compile("a\\s+(\\w+)");
		Matcher m = p.matcher(s);
		while (m.find()) {
			System.out.println(m.group(1));
			s = s.substring(m.end());
		}
	}
}
