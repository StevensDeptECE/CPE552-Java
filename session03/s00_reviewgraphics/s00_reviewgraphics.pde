int n;
int box;
void setup() {
  size(600,600);
  n = 8;
}


void draw() {
  background(0);
  grid();
}

void grid() {
  stroke(255);
  box = width/n;
  for (int i = 0; i < n; i++)
    line(i*box, 0, i*box, height);
  for (int i = 0; i < n; i++)
    line(0, i*box, width, i*box);
  
}

void mousePressed() {
   fill(255,0,0);
   ellipse(mouseX/box*box + box/2, mouseY/box*box + box/2, box,box);
  
}