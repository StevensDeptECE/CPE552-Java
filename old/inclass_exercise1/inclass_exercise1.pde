// sum the numbers from 1 to n
long sum(int n) {
  long s = 0;
  for (int i  = 1; i <= n; i++) { //<>//
    s = s + i; // add i onto the total
  }
  return s;
}

double fact(int n) {
  double prod = 1;                 // 1*2  *3  * 4 * 5
  for (int i = 1; i <= n; i++) {
    prod = prod * i; // 
  }
  return prod;  
}

double choose(int a, int b) {
  return fact(a) / (fact(b) * fact(a-b));
}


long fibo(int n) { // 1, 1, 2, 3, 5, 8, ...
  return 0;
}

void setup() {
  println(sum(4));
//  for (int i = 1; i <= 300; i++) {
//    println(i, factorial(i)); /// use long?
//  }

  println(choose(52, 6));
  
//  println(factorial(50)); // 1*2*3*4*...  double
  
  //println(choose(52, 6)); // 52! / (6! * (52-6)!)  this answer will be a little wrong
  
  /*
     52C6 = 52!    = 52*51*50*49*48*47
            ----     -----------------
            6! 46!    6 *5*4*3*2*1
  
  */
}
