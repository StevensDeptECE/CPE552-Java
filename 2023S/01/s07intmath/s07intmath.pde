void setup() {
 /*
   bit = 0/1  LOW = 0V/HIGH = Vcc = 1.1V on my computer?
   byte = 8 bits
          signed 
   000 = 0   
   001 = 1
   010 = 2
   011 = 3
   100 = -4
   101 = -3
   110 = -2
   111 = -1

   111+
   001
   ===
  1000
  
  byte  -128..127
  short -32768..32767
  int   -2.1billion .. +2.1billion
  long
 */
 
  int a = 2; // whole number, positive/negative   
  a = a + 3; // 5
  a = a - 6; //-1
  
  byte b = 126; 
  b = (byte)(b + 3); // b = -127
  short c = -32767;
  c = - 3; // c=32766
 
  int d = 1234567890;
  // TOO BIG! d = 9186543210;
  d = 3 * 4;
  d = 1000000 * 1000000;
  println(d);
  long e = -123456789012345678L;

  e  = 3 + 5;
  e = 3 - 5;
  
  e = 5 / 3; //1
  e = 5 % 3; // 2 (mod)
  e = -e;// -2
  e = +e; // does nothing
  


}
