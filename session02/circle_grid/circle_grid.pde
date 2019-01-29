void setup() {
  size(600,600);
  final int GRID_SIZE = 50;
  final int S = 20;
  
  for (float x = GRID_SIZE; x <= width - GRID_SIZE; x += 50) {
    for (float y = GRID_SIZE; y <= height - GRID_SIZE; y += 50)
      ellipse(x, y, S, S);
  }
}