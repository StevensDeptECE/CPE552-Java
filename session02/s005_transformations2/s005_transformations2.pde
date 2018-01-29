void setup() {
  size(800,800);
}

void draw() {
   translate(width/2, height/2);
   scale(width, height);
   float r = 1;
   ellipse(0,0, r*2,r*2);
}