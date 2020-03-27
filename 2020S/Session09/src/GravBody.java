/**
 *
 * @author dkruger
 */
public class GravBody {
    public static double G = 5.6e-11;
    
    double x, y, z;
    double vx, vy, vz;
    double ax, ay, az;
    
    public void timeStep(double dt) {
        // compute all accelerations on all bodies
        pos = v0*dt + 0.5*a*dt*dt
        vel = v0 + a* dt
    }
}
