/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dkruger
 */
public class Body {
    private String name;
    private double mass;
    private Vec3d x; //position of the body in 3-space
    private Vec3d v; // velocity
    private Vec3d a; // acceleration
            
    public Body(String name, double mass, double orbDistance, double vel) {
        x = new Vec3d(); // pick a random spot at the correct orbital distance
        v = new Vec3d();
        a = new Vec3d();        
    }
    
    public void zerAcceleration() {
        a.set(0,0,0);
    }
    public void addAcceleration(Body b) {
        // add the acceleration due to b to a
    }
    
    public static void main(String[] args) {
        
        double earthmass = 5.97e24;
        double earthOrbitalDistance = 160e9; // meters from sun
        double earthVel = 0; // Find this!!
        double moonMass = 0; //TODO
        double moonOrbitalDistance = 0; // TODO
        double moonVel = 0;//TODO
        // start earth and moon at the random places in circular orbits
        Body earth = new Body("Earth", earthmass, earthOrbitalDistance, earthVel);
        Body moon = new Body("Moon", moonMass, moonOrbitalDistance, moonVel);
        System.out.println(earth); // print out position, velocity
        System.out.println(moon);
        //earth.zerAcceleration();
        //earth.addAcceleration(moon);
    }
}
