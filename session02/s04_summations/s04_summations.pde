void setup() {
  println("hello");  
  println(2+3, 2 -3,  2*3, 2 /3, 2 % 3);
  println(5%3, 6%3, 7%3, 8%3);

  float a = 1.234567f;
  double b = 1.23456789012345f;
  final double pi = 3.14159265358979; // processing poisons double precision constants! appends f!
  println(b);
  
  float sum = 0; // 5050
  for (int i = 1; i <= 100; i++) {
    sum += 1.0f/(float)i;
  }
  float sum2 = 0;
  for (float i = 100; i >= 1; i--)
    sum2 += 1/i;
  println(sum, sum2);
  
  
  
/*
  1.23
   .099
   .099
--------
  
  1.23
   .099
---------
  1.32
   .099
   -----
  1.41
  
   .099
   .099
-------
   .198
  1.23
  ----
  1.42
  
  */
  
  
  exit(); 
}