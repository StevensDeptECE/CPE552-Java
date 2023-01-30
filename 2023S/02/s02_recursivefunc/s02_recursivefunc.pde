double fact(int n) { // n*(n-1)*(n-1)*...*1   5*4*3*2*1 = 120
  double prod = 1;
  for (int i = 1; i <= n; i++)
    prod *= i;
  return prod;
}


void setup() {
  for (int i = 0; i < 160; i++) {
    double f = fact(i);
    println(f);
  }
  exit();
}
