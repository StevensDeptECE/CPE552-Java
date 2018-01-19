void setup() {
  size(800,800);
  fill(255,0,0);
}

int x = 0;
int y = 0;
int speedX = 3, speedY = 1;
final int RECT_WIDTH = 50, RECT_HEIGHT=50;
void draw() {
  background(0,0,255);
  rect(x,y,RECT_WIDTH, RECT_HEIGHT);
  //x++; //++x; x = x + 1;  x += 1;
  x += speedX;
  y += speedY;
  if (x < 0 || x >= width - RECT_WIDTH) {
    speedX = -speedX;
  }
  if (y < 0 || y >= height - RECT_HEIGHT) {
    speedY = -speedY;
  }
  
}