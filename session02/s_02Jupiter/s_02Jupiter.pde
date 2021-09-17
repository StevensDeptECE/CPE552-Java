PShape planet;

void setup() {
  size(600,600, P3D);
  PImage img = loadImage("jupiter.jpg");
  noStroke();
  planet = createShape(SPHERE, 200);
  planet.setTexture(img);
}

float rotationAng = 0;
float orbitAng = 0;
float orbitDist = 300;
void draw() {
  background(0); // space is black
  translate(width/2, height/2, -600); // set origin
   
  rotateY(orbitAng);
  translate(orbitDist,0,0);
  rotateY(-orbitAng);
  rotateZ(3.5*PI/180);
  rotateY(rotationAng);
  shape(planet);
  rotationAng +=.1;
  orbitAng += .01;
}
