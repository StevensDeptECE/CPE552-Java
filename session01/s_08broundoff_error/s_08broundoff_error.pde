void setup() {
  int sum = 0;
  for (int i = 1; i <= 10; i++) {
    print(i, "");
    sum += i;
  }
  println(sum);
  
//  println(1.0/1 + 1.0/2 + 1.0/3);

  /*roundoff error
    We are used to some fractions being "nice" and others are repeating decimal.
    1/2 = 0.5
    1/3 = .33333333
 
    on a computer, floating point is in base 2
    
        .10100001010101010111100101
  1/2 = .100000000000000000000000

      1/2 1/4  1/8  1/16  1/32 ...
      
      1/10 = 1/2 * 1/5
         .000101010101010101...

    floating point numbers:
      1.234567e+38
      2.51234e-38
    
    
    addition errors:
    suppose we have a 3 digit computer
       1.38
        .00528
        .00499
    
    1.38
   + .00528
   =======
    1.38
   + .00499
   =======
    1.38
 
    but take the numbers in reverse:
        .00528
        .00499
        ======
        .01027
       1.38
       1.39
 
    
  */
  for (float i = 0; i <= 10; i += 0.1)
    print(i, "");
  exit();
}