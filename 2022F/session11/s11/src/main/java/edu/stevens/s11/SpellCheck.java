package edu.stevens.s11;
import java.io.*;
import java.util.*;

/**
 * @author DovKr
 */
public class SpellCheck {
  public static void main(String []args) {
    try {
      HashSet<String> dict = new HashSet<>();
      Scanner dictScanner = new Scanner(new BufferedReader(new FileReader("dict.txt")));
      while (dictScanner.hasNext()) {
        String word = dictScanner.nextLine();
        for (int i = 0; i < word.length(); i++)
          if (word.charAt(i) < ' ') {
            word = word.substring(0, i-1);
            break;
          }
        dict.add(word);
        
      }
      Scanner s = new Scanner(new BufferedReader(new FileReader("test.txt")));
      String word;
      
      while (s.hasNext()) {
        word = s.next();
        System.out.println(word);
        
        // how do you know if the word is spelled correctly?
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
