void setup() {
  size(800,800, P3D);
}

void draw() {
  beginShape();
  fill(255,0,0);
  vertex(0,0);
  fill(0,255,0);
  vertex(200,0);
  fill(0,0,255);
  vertex(100,400);
  endShape();
}