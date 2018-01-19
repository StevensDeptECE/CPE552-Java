void setup() {
  size(600,400);
  fill(255,0,0);
}

int x = 0;
int y = 0;
void draw() {
  background(0,0,255);
  rect(x,y,20,30);
  //x++; //++x; x = x + 1;  x += 1;
  x += 2;
  if (x >= 600) {
    x = 0;
  }
}