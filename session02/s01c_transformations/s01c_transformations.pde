void setup() {
  size(800,800);
}

float x = 0, y = 0, dx = 2.1, dy = 3.2;
void draw() {
  translate(width/2, height/2);
  scale(width/2/(2*PI), -height/(1 - -1));
  strokeWeight(0);
  float dx = 4*PI / width;
  for (float x = -2*PI; x < 2*PI; x += dx) {
    float y = sin(x);
    line(x,0, x,y);
  }
}