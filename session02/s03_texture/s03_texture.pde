PShape earth;
void setup() {
  size(800,800, P3D);
  noStroke();
  earth = createShape(SPHERE, 400);
  PImage img = loadImage("earthmap1k.jpg");
  earth.setTexture(img);
}

float ang = 0;
void draw() {
  background(0);
  translate(width/2,height/2,-400);
  
  pushMatrix();
  rotateZ(23.5*PI/180);
  rotateY(ang);
  shape(earth);
  ang += 0.01;
  popMatrix();

  // to place body anywhere...
  
  // 1. rotate to angle in orbit
  // 2. translate on x
  // 3. unrotate by same angle (leaves the body with original orientation)
   // you may leave off step 3 for moon 
  
}