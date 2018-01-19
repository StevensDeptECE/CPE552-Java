double factorial(int n) {
  double prod = 1;
  for (int i = 1; i <= n; i++)
    prod = prod * i;
  return prod;
}
// 2 rules for recursion
//  must call itself
//  must have if to terminate (termination condition)

double factorial2(int n) {
    if (n == 1)
      return 1;
    return n * factorial2(n-1);
}

// define recursively
int count(int n) {
  if ( ) {
    return 0;
  }
  return ...;
}

void setup() {
  int prod  = 1;
  for (int i = 1; i <= 5; i++)
    prod = prod * i;
  println(prod);
  println(factorial(6));
  println(factorial(10));
  println(factorial(17));
  println(factorial(20));
  println(factorial(25));
  println(factorial2(6));
 exit(); 
}