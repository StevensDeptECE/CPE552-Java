
void setup() {
  size(800,800);
}

float x = 0, y = 0, dx = 2.1, dy = 3.2;
void draw() {
  fill(0,0,0, 20);
  rect(0,0, width, height);
  fill(255,0,0);
  rect(x,y, 50, 50);
  x += dx; y += dy;
  if (x < 0 || x >= width) {
    dx = -dx;
  }
  if (y < 0 || y >= height) {
    dy = -dy;
  }
}

void mousePressed() {
  ellipse(mouseX, mouseY, 50,50);
}