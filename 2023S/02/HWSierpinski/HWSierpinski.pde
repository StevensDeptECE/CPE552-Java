void sierpinski(int level, float x1, float y1, float x2, float y2, float x3, float y3 ) {
  if (level <= 0) {
    triangle(x1,y1, x2,y2, x3,y3);    
    return;
  }
  
  level -= 1;
//  sierpinski(level-1, ...);
//  sierpinski(level-1, ...);
//  sierpinski(level-1);
  
}

void setup() {
  size(800,600);
  frameRate(1);
}


int level = 0;
void draw() {
  sierpinski(level, 0,0, width/2,height-1, width-1,0);
  //level++;
}
