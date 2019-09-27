void setup() {
  size(800,800, P3D);
}

void draw() {
  beginShape();
  fill(255,0,0);
  vertex(0,0);
  fill(0,255,0);
  vertex(width/2,height-1);
  fill(0,0,255);
  vertex(width-1, 0);
  endShape();
}
