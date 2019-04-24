package sessionobjectorientedbasics;

import java.io.Serializable;

/**
 * @author dkruger
 */
public class Vector implements Serializable {
    private static final long serialVersionUID = 1;
    
    public double x,y,z;
    public Vector(double x, double y, double z) {
        this.x = x; this.y = y; this.z = z;
    }
    public Vector() { x = y = z = 0; }
    
    public void setX(double x) { this.x = x; }
    public double getX() { return x; }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
    public String toString() { 
        return x + "," + y + "," + z;
    }
}
