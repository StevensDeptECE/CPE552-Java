void setup() {
  int a = 2 + 2;
  int b = 2 * 3;
  int c = 2 / 3;
  int d = 2 % 3;
  println(a, b, c, d);
  
  println(5 % 2, 6 % 2, 7 % 2);
  println(7 % 3, 8 % 3, 9 % 3, 10 % 3);
  
  int n = 51;

// odd even test
  if (n % 2 == 0)
    println("even");
  else
    println("odd");
    
  exit();
}