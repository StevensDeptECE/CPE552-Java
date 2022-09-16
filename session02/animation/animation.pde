int n = 4;
void setup() {
  size(800,800);
  frameRate(1);
}

void draw() {
  background(255);
  translate(width/2,height/2);
  float dt = 2*PI/n;
  final float r = 400;
  float x = r, y = 0;
  float xnext, ynext;
  float theta = dt;
  for (int i = 0; i <= n; i++, theta += dt) {
    xnext = r* cos(theta); ynext = r*sin(theta);
    line(x, y, xnext, ynext);
    x = xnext; y=ynext;
  }
  n++;
  if (n > 20)
    n = 3;
}
