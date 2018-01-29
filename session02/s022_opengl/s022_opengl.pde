void setup() {
   size(800,800, P3D); 
}

void draw() {
  translate(width/2, height/2, 0);
  beginShape();
  fill(255,0,0);
  vertex(-width/2,-height/2);
  fill(0,255,0);
  vertex(0,height/2);
  fill(0,0,255);
  vertex(width/2,-height/2);
  endShape();
  
}