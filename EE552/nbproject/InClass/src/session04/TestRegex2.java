/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session04;

import java.util.regex.*;
import java.util.*;
import java.io.*;

/**
 *
 * @author dkruger
 */
public class TestRegex2 {
  public static void main(String[] args) throws IOException {
    Pattern p = Pattern.compile("define|include|menu");
    BufferedReader br = new BufferedReader(new FileReader("conf/samples.conf"));
    String line;
    
    while ((line = br.readLine()) != null) {
      Matcher m = p.matcher(line);
      if (m.find()) {
        System.out.println(m.group());
      }
      
    }
  }
  
}
