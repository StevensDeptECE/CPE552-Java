void setup() {
  size(800,800);
}

void sierpinski(int x1, int y1, int x2, int y2, int x3, int y3, int level) {
//termination condition
  ///  if (  )
//    return;

  //  triangle(x1,y1, x2,y2, x3,y3);
  int xa = (x1 + x2) / 2, ya = (y1 + y2) / 2;
  int xb = (x2 + x3) / 2, yb = (y2 + y3) / 2;
  //int xc
  
  
  // call yourself 3 times!
//  sierpinski(    level-1);  
//  sierpinski( level-1);  
//  sierpinski( level-1);  
}


int level = 0;
void draw() {
  sierpinski(0,height-1, width/2,0, width-1,height-1, level);
  level++;
  if (level > 9)
    level = 0;
}