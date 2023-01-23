/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.stevens.session03;

/**
 *
 * @author dkruger
 */
public class First {
    public static void main(String[]args) {
        
       final int n = 1000000;
       int stop = 61000;
       for (float i = 1; i <= n; i++) {
       float sum = 0;
          sum += 1.0/(i*i);
/*
          if (i == stop) {
              System.out.println(i);
              stop += 1000;
          }
*/
       }
       System.out.println(Math.sqrt(6*sum));
    }
}

