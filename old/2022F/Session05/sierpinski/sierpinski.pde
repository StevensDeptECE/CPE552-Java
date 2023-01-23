void setup() {
  size(1000,1000);
}

void sierpinski(int x1, int y1, int x2, int y2, int x3, int y3, int level) {
  if (level <= 0) {
    // draw a triangle
    return;
  }
  
  
  
}

void draw() {
  sierpinski(0,height-1, width/2,0, width-1, height-1, 8); 
}
