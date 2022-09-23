void setup() {
  size(600,400);
}

int x = 0, y = 0;
int dx = 2;
final int BOXWIDTH = 100;
void draw() {
  background(0);
  rect(x,y, BOXWIDTH,BOXWIDTH);
  x = x + dx;
  if (x < 0 || x >= width - BOXWIDTH) {
    dx = -dx;
  }
}

void mousePressed() {
  //println(mouseX + "," + mouseY); 
}
