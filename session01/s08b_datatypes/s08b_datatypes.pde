import java.util.*;
void setup() {
  //  + - * / %
  int a = 2 + 3;
  int b = 2 - 6;
  int c = 2 * 3;
  int d = 2 / 3;
  println(a, b, c, d);
  println(2 / 3, 3/3, 4/3, 5/3, 6/3);
  println(2 % 3, 3%3, 4%3, 5%3, 6%3);
  println(2 + 3 * 4, (2+3)*4, 2 / 3 * 3, 2 * 3 / 3);
  float f = 3.1415926f;
  println(f);
  double df = 3.14159265358979;
  println(df);
  float sum = 1 / 1 + 1/2.0f + 1.0f/2 + 1.0f/2.0f;
  println(sum);
  Scanner s = new Scanner(System.in);
  float x = s.nextFloat();
  println(x);
}