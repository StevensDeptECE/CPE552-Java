void setup() {
  size(800, 800);
}

final int N = 8;
int dx;
int[] pieces = new int[N][N];
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
  // draw the pieces on top of the board
}

void mousePressed() {
     println(mouseX, mouseY); 
     fill(255,0,0);
     ellipse(mouseX/dx*dx, mouseY/dx*dx, dx,dx); 
     // instead of drawing, add your piece to the array!
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
