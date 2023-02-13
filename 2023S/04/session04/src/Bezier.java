/*
    Complete this class for homework!

     */
public class Bezier {
    private float ax,bx,cx,dx;
    private float ay,by,cy,dy;
//https://en.wikipedia.org/wiki/B%C3%A9zier_curve
    // x(t) = ax*t^3 + bx*t^2 + cx*t + dx   ax*Math.pow(t,3) + bx * Math.pow(t,2) + ...
    // x(t) = ((ax*t + bx)*t + cx) * t + dx
    // @t=0 dx = whatever the x is
    // @t=1 ax *1 + bx*t + cx*1 + dx = P3
    // @t=1 ax+bx+cx = P3.x-P0.x

    // x'(t) = 3ax*t^2 + 2bx*t + cx
    public static void main(String[] args) {
        //Bezier b = new Bezier(0,0,   50,100,    350,100, 400,0);
        float t =0;
        for (int i = 0; i <= 10; i++, t += 0.1) {
//            float x = b.x(t);
//            float y = b.y(t);
            System.out.println(t); //x + "," + y);
        }
    }

}
