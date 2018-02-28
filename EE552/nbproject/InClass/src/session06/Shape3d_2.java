package session06;

/**
 * @author dkruger
 */
public interface Shape3d_2 {
  public Sphere boundingSphere();
  public double volume();
  public Shape3d_2 inverse();
}
