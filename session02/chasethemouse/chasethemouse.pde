/*
  create an array like the bouncing balls.
  Our goal is to draw n=10 objects each at a random location
  and make them all go towards the mouse when
  the button is pressed.
  
  When the button is not pressed, they should move in a random direction.

*/

float x = 400, y = 400;
PImage img;
void setup() {
  size(800,800);
  img = loadImage("cat.jpg");
}

void draw() {
  image(img, x,y, 50,50);
  if (mousePressed) {
      println(mouseX, mouseY);
  }
  x += 1; y +=2;
  // You make it move in a random direction...
}
