package edu.stevens.session08;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
import java.util.regex.*;

// java.util.ArrayList
// java.util.HashSet
/**
 * @author DovKr
 */
public class RegexDemo {
  public static ArrayList<String> readKeywordList() {
    ArrayList<String> keywords = new ArrayList<>();
    try {
      FileReader fr = new FileReader("keywords.txt");
      BufferedReader br = new BufferedReader(fr);
      String line;
      
      while  ((line = br.readLine()) != null ){
        keywords.add(line.strip());
      }
    } catch (Exception e) {
      e.printStackTrace();
      return new ArrayList<>();
    }
    return keywords;
  }
  public static HashSet<String> readKeywordSet() {
    HashSet<String> keywords = new HashSet<>();
    try {
      FileReader fr = new FileReader("keywords.txt");
      BufferedReader br = new BufferedReader(fr);
      String line;
      
      while  ((line = br.readLine()) != null ){
        keywords.add(line.strip());
      }
    } catch (Exception e) {
      e.printStackTrace();
      return new HashSet<>();
    }
    return keywords;
  }

  public static void main(String[] args) {
    ArrayList<String> keywords = readKeywordList();
    HashSet<String> keywordsHash = readKeywordSet();
    
    String s = "int a = 5; long thisIsALongVariableName = 6;";
    Pattern p = Pattern.compile("[a-zA-Z_$][0-9A-Za-z$_]*" );
    Matcher m = p.matcher(s);
    int start = 0;
    boolean result = m.find(start);
    outer:
    while (result) {
      String name = m.group();
      for (int i = 0; i < keywords.size(); i++)
        if (keywords.get(i).equals(name) ) {
         start = m.end();
         result = m.find(start);
         continue outer;
        }
      //if (keywordsHash.contains(name)) {
      //} else
      System.out.println(name);
       start = m.end();
      result = m.find(start);
    }; 
  }
}