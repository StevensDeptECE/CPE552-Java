void setup() {
  int i = 0;
  double sum = 1;
  while (i < 200) {
    println(i, sum);
    i = i + 1;
    sum = sum + sum;
  }
  exit();
}