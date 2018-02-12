/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.stevens.dkruger.gutil;
import java.io.*;
import java.util.*;
import java.util.regex.*;
/**
 *
 * @author dkruger
 */
public class Config {
    private boolean verbose;
    private HashMap<String,String> map;
    private static Pattern blankLine = Pattern.compile("\\s*");
    private static Pattern commands = Pattern.compile("^\\s*(include|define|menu|regex|toolbar)([a-zA-Z][a-zA-Z0-9]*)");

    private void loadFile(String filename) throws IOException {
        Scanner s = new Scanner(new BufferedReader(new FileReader(filename)));
        for (int lineNum = 1; s.hasNext(); ++lineNum) {
            String line = s.nextLine();
            if (verbose) {
                System.out.println(lineNum + ": " + line);
            }
            Matcher m = commands.matcher(line);
            if (m.lookingAt()) {
                String cmd = m.group(0);
                System.out.println("cmd=" + cmd);
            } else {
                System.err.println("Error " + filename + ":" + lineNum + " No valid command found");
            }
        }
        s.close();
    }
    
    public Config(String filename) throws IOException {
        verbose = true; // turn it on for now
        map = new HashMap<>();
        loadFile(filename);
    }
}
