package session07;

/**
 *
 * @author dkruger
 */
public interface Shape3d {
    public boolean contains(Vec3d v);
    public  Sphere boundingSphere(); 
}
