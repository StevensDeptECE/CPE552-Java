void setup() {
  size(800,800);
}

/*
  graph sin(x) from -2pi to +2pi 
  y scale from -1 (bottom) to +1 (top)
*/
float x = 0, y = 0, dx = 2.1, dy = 3.2;
void draw() {
  translate(width/2, height/2);
  scale(width/2/(2*PI), -height/(1 - -1));
  strokeWeight(0);
  float lastX = -2*PI, lastY = sin(lastX);
  for (float x = lastX; x < 2*PI; x += .01) {
    float y = sin(x);
    //point(x,y);
    //line(lastX, lastY, x, y);
    line(x,0, x,y);
    lastX = x;
    lastY = y;
  }
}
