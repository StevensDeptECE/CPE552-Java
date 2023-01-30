//recursive function calls itself
// must stop!

double fact(int n) { // n*(n-1)*(n-1)*...*1   5*4*3*2*1 = 120
  if (n <= 0 )
    return 1;
  return n * fact(n-1);  //3! = 3*2!  2! = 2*1!  1! = 1*0!  0! = 1
}

// 1 1 2 3 5 8 13 21 34 55 89 ...
double fibo(int n) {
  return 0; // TODO: finish this!
}


void setup() {
  println(fact(3));
  println(fact(0));
  println(fact(-1));
  exit();
}
