package edu.stevens.session08;
// 2^15 = 32768
/**
 * @author DovKr
 */
public class Session08 {
    public static void main(String[] args) {
      int a = 10 / 3 / 4; // 0
      int b = 3 / 5 * 2; // 0
      int c = 5 / 2 * 2; // 4
      double d = 5 / 2 / 4; //0
      double e = 5 / 2 / 4.0; // 5/2 --> 2, 2--> 2.0  2.0/4.0 = 0.5
      double f = 5 / 2.0 / 4; // 5.0 / 2.0 --> 2.5 / 4 -->.625
      double g = 2 * 7.0 / 2; // 7.0
      double g2 = 2 * (7 / 2); // 6.0 
      double g3 = 2 * (7 / 2.0); // 7.0
      double g4 = 2.0 * (int)(7/3.0);//4.0
      int h = (int)(4.5 * 3); // 13
      int i = (int)4.5 * 5; // 20
      short j = 32767; // -32768..32767
      j += 3; // -32766
      
      long k = 1000000 * 1000000;
      if (k == 1000000000000L) {
         // does this happen
      }
      int m = 5 % 4 - 4 % 5 + 6 % 4 - 8 % 3;
      //        1    -   4  +  2 -  2 = -3
      double sum3 = 4;
      for (int jj = 3; jj < 17; jj += 3)
        sum3 += jj/2;
      
      // sum3 = 25.5
    }
}
