double hypot(double a, double b) {
  Math.sqrt(a*a + b*b);  
}

// f(x) = x^2
double f(double x) {
  return x*x;
}

int f(int x) {
  return x*x*x;
}

float f(float x) {
  return 2*x;
}

void setup() {
  int y = f(3);
  System.out.println(y);
  double z = f(3.0); 
  System.out.println(z); 
  float w = f(4.0);
  System.out.println(w);
  
  final double pi = 3.14159265358979;
  System.out.println(pi);
}
