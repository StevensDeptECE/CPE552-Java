package session10;

/**
 * + 100 bonus for sphere
 * @author dkruger
 */
public class TestShape {
    public static void main(String[] args) {
        Model m = new Model();
        Cube cube = new Cube(20,10,2);
        m.add(cube);
        Cylinder cyl = new Cylinder(10, 30); //r=10, h=30
        m.add(cyl);
        m.write("test.stl");
    }
}
