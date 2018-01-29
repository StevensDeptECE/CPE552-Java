void setup() {
  size(400,600);
}

void draw() {
/*  int d;
  if (height < width) {
    d = height;
  } else {
    d = width;
  }
  */
 // int d = height < width ? height : width;
  int d = Math.min(width, height);
  ellipse(width/2, height/2, d, d);
  
}