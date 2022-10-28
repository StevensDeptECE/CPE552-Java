package edu.stevens.session08;

import java.io.*;
import java.util.regex.*;

/**
 * @author DovKr
 */
public class MarkdownCompiler {
  final static Pattern header = Pattern.compile("(#{1,3})\\s+(.*)");
  final static Pattern link = Pattern.compile("");
  final static Pattern image = Pattern.compile("");
  final static Pattern list = Pattern.compile("");
  public static void main(String[] args) throws Exception {
    String filename = args.length > 1 ? args[0] : "test.md";
    String out = filename.replace(".md", ".html");
    BufferedReader br = new BufferedReader(new FileReader(filename));
    // print <DOCTYPE>.. <html> into output file
    // read in each line of the input file
    // try to regex match each pattern
    // if it matches, print out the matching groups
    // Matcher...
  }
}

abstract class Tag {
  public abstract void outputHTML(Matcher m, PrintWriter pw);
}

class Header extends Tag { // <h1> <h2> <h3> ...
  public void outputHTML(Matcher m, PrintWriter pw) {
    pw.println("<h1>" + ... + "</h1>");
  }
}

class Link extends Tag {
  
}