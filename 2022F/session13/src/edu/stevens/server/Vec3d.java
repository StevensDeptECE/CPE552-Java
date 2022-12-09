package edu.stevens.server;

import java.io.*;
public class Vec3d implements java.io.Serializable {
    public double x, y, z;

    public Vec3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // INstead of constructor with no parameter, can allow serialization
//    public edu.stevens.server.Vec3d() { this (0,0,0); }
    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public static void main(String[] args) throws Exception {
       ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"));
       Vec3d v = new Vec3d(1,2,3);
       oos.writeObject(v);
       oos.close();
    }
}
