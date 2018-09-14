void setup() {
  size(800,600, P3D);
}

float x = 0, y = 0, z = 0;
float dx = 1.2, dy = 1.5,dz = 4.5;
void draw() {
  background(0,0,200);
  translate(width/2,height/2,-height);
  translate(x,y,z);
  box(100);
  x = x + dx;
  y += dy;
  z += dz;
  if (x < 0 || x >= width)
    dx = -dx;
  if (y < 0 || y >= height)
    dy = -dy;
    
  if (z < 0 || z >= width)
    dz = -dz;
}