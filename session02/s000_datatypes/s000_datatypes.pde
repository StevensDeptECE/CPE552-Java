/*
000 = 0
001 = 1
010 = 2
011 = 3
100 = -4
101 = -3
110 = -2
111 = -1
*/
void setup() {
   short s = 32767;
   s++;
   println(s);
   
   int d = 0x7FFFFFFF; // 0111 1111 1111 1111 1111 1111 1111 1111
  println(d);
  d++;
  println(d);
  long big = 0x7FFFFFFFFFFFFFFFL;
  println(big);
  big++;
  print(big);
  exit();
}
