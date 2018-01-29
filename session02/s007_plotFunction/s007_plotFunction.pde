void setup() {
  size(800,800);
}

float ang = 0;
void draw() {
  background(0);
  // plot sin(x)   sin(0) = 0  sin (PI/2) = 1
  
  float dx = 2*PI / width;
  for (float x = 0; x < 2*PI; x += dx) {
     println(x, sin(x)); 
  }
  
}