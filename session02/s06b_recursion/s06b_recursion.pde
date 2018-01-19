double factorial(int n) {
  double prod = 1;
  for (int i = 1; i <= n; i++)
    prod *= i;
  return prod;
}

// recursive
double factorial2(int n) {
  if (n <= 0)
     return 1;
  return n * factorial2(n-1);
}
  
double factorial3(int n) {
  if (n <= 0)
    return 1;
  else
    return n * factorial2(n-1);
}
  
void setup() {
  factorial(5);
}
  