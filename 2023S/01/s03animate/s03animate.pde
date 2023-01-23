void setup() {
  size(600,400);
  fill(255, 0,255);
  //frameRate(0.5);
}

int x = 0, y = 0;
void draw() {
  background(150,150,150);
  rect(x, y, 100,50);
  x = x + 1;
}
