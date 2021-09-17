
double fact(int n) {
  double prod = 1;
  for (int i = 1; i <= n; i++)
    prod *= i;
  return prod;
}

double fact2(int n) {
  if (n <= 1)
    return 1;
    
  return n *fact2(n-1 );
  
}

int count(int n) {
  if (n <= 0) {
     return 0;
  }
  return 1 + count(n-1);
}



void setup() {
  println(fact2(10));
  println(fact2(20));
  println(fact2(30));
  println(fact2(100));
  println(fact2(200));
  println(count(100));
  println(count(100000));
  exit();
}
