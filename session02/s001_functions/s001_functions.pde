//    f(x) = x*x
int f(int x) { return x*x; }

int g(double a) { return (int)a; }

double h(double a, double b) {
  return a < b ? a : b;
}

float hypotenuse(float a, float b) {
   return sqrt(a*a + b*b); 
}

// n! = n*(n-1)*(n-2)*...1
double factorial(int n) {
  double x = 1;
  for (int i = n; i >= 1; i--) {
    println(i, x);
    x *= i;
  }
  return x;
}




void setup() {
  println(f(3));
  for (int i = 0; i < 5; i++)
    print(f(i)); // 014916
  println();
  println(g(5.999));
  println(h(1.2,2.3));
  
  float c = hypotenuse(3.0, 4.0); //  5.0   sqrt( )
  double f = factorial(5); //5*4*3*2*1 = 120.0 
  println(f);
  println(factorial(20));  //  1.2345e+300
//  println(findEps()); // 1 + e  == 1  (e is so small) 
  exit(); 
}