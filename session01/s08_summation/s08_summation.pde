void setup() {
  int sum = 0;
  int i = 1;
  while (i < 100) {
    sum = sum + i;
    println(i, sum);
    i = i + 1;
  }
  
  int sum2 = 0;
  for (int j = 1; j <= 10; j++)
    sum2 = sum2 + j;
  println(sum, sum2);
  exit();
}