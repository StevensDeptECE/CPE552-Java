/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session04;

import java.util.regex.*;

/**
 *
 * @author dkruger
 */
public class TestRegex {
  public static void main(String[] args) {
    Pattern test1 = Pattern.compile("class\\s+[A-Z][a-zA-Z0-9]*\\s*{");
    Pattern p = Pattern.compile("[a-zA-Z_][a-zA-Z0-9_]*");
    String s = "abc a123 ABC 123 hello thisIsALongVarName testing123 123ABC";
    Matcher m = p.matcher(s);
    while (m.find()) {
      System.out.println(m.group());
    }
  }
  
}
