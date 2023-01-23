void setup() {
  size(600,400);
  fill(255, 0,255);
  //frameRate(0.5);
}

float x = 0, y = 0;
float dx = 3.1, dy = 0.37;
void draw() {
  background(150,150,150);
  rect(x, y, 100,50);
  x = x + dx;
  if (x < 0 || x >= 600) {
    dx = -dx;    
  }
  y = y + dy;
  if (y < 0 || y >= 400) {
    dy = -dy;    
  }
/*  
  if (x >= 600) {
    dx = -dx;
  }
  if (x < 0) {
    dx = -dx; 
  }
  */
}
