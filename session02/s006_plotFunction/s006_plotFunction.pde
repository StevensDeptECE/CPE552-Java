void setup() {
  size(800,800);
}

float ang = 0;
void draw() {
 background(random(255), random(255), random(255));
   translate(width/2, height/2);
   rotate(ang);
   line (0,0, 400,0);
   ang += .01;
}