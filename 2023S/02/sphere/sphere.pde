PShape s1, s2;
float angle = 0;
float jupOrbitalAngle = 0;
float jupSpinAngle = 0;

void setup(){
  size(800, 600, P3D);
  //sphere(500);
//  sphereDetail(6);
  noStroke();
  s1 = createShape(SPHERE, 100);
  s2 = createShape(SPHERE, 300);
  PImage img1 = loadImage("earth.jpg");
  PImage img2 = loadImage("jupyter.jpg");
  s1.setTexture(img1);
  s2.setTexture(img2);
}

void draw() {
  background(0);
  translate(width/2,height/2,-height);
  //scale(0.5);
  scale(1, -1, 1);
  pushMatrix();
  rotateZ(23.5/180*PI);
  rotateY(angle);
  scale(1.1, -1.1, 1);
  angle += 0.01;
  shape(s1);
  popMatrix();
  pushMatrix();
  rotateY(jupOrbitalAngle);
  translate(500, 0);
  rotateY(-jupOrbitalAngle);
  rotateY(jupSpinAngle);
  jupOrbitalAngle += 0.005;
  jupSpinAngle += 0.1;
  shape(s2);
  popMatrix();
}
