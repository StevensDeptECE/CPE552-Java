/*  Write a processing code first print out the even number from 0 to 100 
 *  then print out the odd number in a reverse order. The output should like this
 *  0 2 4 .... 100
 *  99 97 95 .... 1
 */
 
 void setup() {
   for(int i = 0; i <= 100; i += 2) print(i + " ");
   println();
   for(int i = 99; i >= 0; i -= 2) print(i + " ");
   exit();
 }