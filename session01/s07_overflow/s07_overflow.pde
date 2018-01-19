void setup() {
  int i = 0;
  int sum = 1;
  while (i < 10) {
    println(i, sum);
    i = i + 1;
    sum = sum + sum;
  }
  exit();
}