int x, y;
void setup() {
  size(800,800);
  x = width/2; y = 0;
}

int dy = 2;
void draw() {
  background(255);
  fill(0,255,0);
  triangle(0,0, x,y, 0,height-1);
  fill(255,255,0);
  triangle(x,y,  width-1,0,  width-1,height-1);
  y += dy;
  if (y < 0 || y >= height) {
    dy = -dy;
  }
}