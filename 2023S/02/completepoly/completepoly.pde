int n = 7;

void setup() {
  size(600,600); 
}

void mousePressed() {
  if (mouseButton == LEFT)
    n++;
  else
    n--;
}

void draw() {
  background(255,200,0);
  translate(width/2, height/2);
  scale(1,-1);
  final float r = 260;
  final float dt = 2*PI/n;
  float lastx = r, lasty = 0; 
  for (float t = 0; t < 2*PI; t += dt) {
    float x = r*cos(t), y = r*sin(t);
    circle(x,y,10);
    //float x2 = r*cos(t+dt), y2 = r*sin(t+dt);
    line(lastx, lasty, x, y);
    lastx = x;
    lasty = y;
    //HW: connect every  point to every other point
    //for () {
      
    //}
  }
}
