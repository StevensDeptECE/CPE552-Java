/*  Write a processing code that simulating ball 
 *  bounce. Remember every time the ball touch the 
 *  ground it will lose some energy. Finally it will
 *  stop. Change the value to make it like real.
 */ 
 
void setup(){
  size(1200,600);
}
int x = 20, y = 20, boundary = 590;
float v_y = 0, v_x = 1;   // Speed
float a = 0.1; // Acceleration
void draw(){
 // clear();
  ellipse(x, y, 20, 20);
  x += v_x;
  y += v_y;
  v_y += a;
  if(y > 590) {
    if(abs(v_y) - 2 < 0){  // this part is to let the ball stop.
      v_y = 0;
      y = 590;
      a = 0;
    } else {
      v_y = v_y > 0 ? v_y - 0.9 : v_y + 0.9;
    } 
    v_y = -0.8 * v_y;
  } 

}