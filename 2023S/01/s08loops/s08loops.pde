void setup() {
  int a = 1;
  while (a <= 10) { // a=1 2 3 4 5 
    println(a);
    a = a + 1;
  }
  for (int i = 1; i <= 10; i = i + 1) {
    println(i);
  }
  for (int i = 1; i <= 10; i = i + 1)
    println(i);

  
  int b = 7;
  while (b > 11) { // while loop can execute ZERO times
    println(b);
    b = b - 2;
  }
  
  for (int i = 1; i <= 50; i += 2) { // i = i + 2  
    print(i, "");
  }
  println();
  
  for (int i = 10; i >= 0; i--) { // i = i - 1; i -= 1; i--; --i;
    print(i, "");
  }
  println("blastoff");
  
  /*
  do {
    
    
  } while ( );
  
  */
  
  exit();
}
