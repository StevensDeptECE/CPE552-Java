final int SIZE = 50;
final int NUM_BALLS = 10;
float [] x = new float[NUM_BALLS]; // x[0]  x[1]  ... x[9]
float [] y = new float[NUM_BALLS]; // y[0]  y[1]  ... y[9]
float[] dx = new float[NUM_BALLS];
float[] dy = new float[NUM_BALLS];

void setup() {
  size(800,800);
  for (int i = 0; i < NUM_BALLS; i++) {
    x[i] = random(width);
    y[i] = random(height);
    dx[i] = random(6) - 3;
    dy[i] = random(6) - 3;
  }
}

void draw() {
  fill(0,0,0, 15);
  rect(0,0, width,height);
  fill(255,0,0);
  for (int i = 0; i < NUM_BALLS; i++) {
    ellipse(x[i], y[i], SIZE,SIZE);
    x[i] += dx[i];
    y[i] += dy[i];
    if (x[i] < 0 || x[i] >= width)
      dx[i] = -dx[i];
    if (y[i] < 0 || y[i] >= width)
      dy[i] = -dy[i];
  }
}
