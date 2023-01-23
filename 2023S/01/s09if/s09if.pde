void setup() {
  /*
     < less than
     <= less than  or equal to
     > greater than
     >= greater than or equal to
     == equal
     != not equal

     => NOT OK
     > = NOT OK
  */
  for (int i = 1; i <= 10; i++) {
    if (i % 2 != 0 ) {
      print(i, "");
    }    
  }
  println();
//
  for (int i = 1; i <= 10; i++) {
    if (i % 2 != 0 ) {
      print(i, "odd ");
    } else {
      print(i, "even ");
    }
  }
  
  println();
  for (int i = 1; i < 17; i += 3)
    if (i % 4 == 0)
      println(i);

}
