PShape earth;

void setup() {
  size(800,800,P3D);
  PImage img = loadImage("earth.jpg");
  noStroke();
  sphereDetail(50);
  earth = createShape(SPHERE, 500);
  earth.setTexture(img);
  //frameRate(60);
}
float a = 0;
final float DEG2RAD = PI/180;
void draw() {
  translate(width/2, height/2, -500);
  rotateZ(23.5 * DEG2RAD);
  rotateY(a);
//  earth.rotateY(0.01);
  shape(earth); 
  a += 0.01;
}
