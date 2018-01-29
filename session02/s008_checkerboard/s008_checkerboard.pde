void setup() {
  size(800, 800);
}

final int N = 8;
int dx;
void draw() {
  int c = 0;
  dx = width / N;
  for (int y = 0; y < height; y += dx) {
    for (int x = 0; x < width; x += dx) {
      fill(c = 255 - c);
      rect(x, y, dx, dx);
    }
    c = 255-c;
  }
}

void mousePressed() {
     println(mouseX, mouseY); 
     ellipse(mouseX, mouseY, dx,dx); 
}
/*
void draw() {
 final int dx = width / N;
 for (int y = 0; y < height; y += dx)
 for (int x = 0; x < width; x += dx) {
 fill(x /100 % 2 == 0 ? 0: 255);
 rect(x,y, dx,dx);
 }
 }*/