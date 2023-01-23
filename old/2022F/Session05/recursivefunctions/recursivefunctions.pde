double factorial(int n) {
  double prod = 1;
  for (int i = 1; i <= n; i++)
    prod = prod*i;
  return prod;
}

double factorial2(int n) {
  if (n == 1 ) {
    return 1;
  }
  return n * factorial2(n-1);
}

void setup() {
  for (int i = 1; i < 10; i++) {
    println(factorial(i)); 
    println(factorial2(i)); 
  }
  exit();
}
