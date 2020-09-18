int fact(int n) {
   if (n <= 1)  // 0! = 1   1! = 1
      return 1;
      print(n, ""); // watch as the stack gets called...
   return n * fact(n-1);
}

// write a recursive count function
int count(int n) {
  
}

void setup() {
  println(fact(25));
  println(count(30000));
  exit();
}
