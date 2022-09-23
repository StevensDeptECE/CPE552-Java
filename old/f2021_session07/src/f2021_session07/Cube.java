import java.io.*;

public class Cube {
  private float side;
  public Cube(float s) { side = s; }

  private final void writeFacet(PrintWriter pw, double x1, double y1, double z1,
                                double x2, double y2, double z2, double x3,
                                double y3, double z3) {
    pw.println("facet normal ");
    pw.println("  outer loop");
    pw.println("    vertex " + x1 + " " + y1 + " " + z1);
    pw.println("    vertex " + x2 + " " + y2 + " " + z2);
    pw.println("    vertex " + x3 + " " + y3 + " " + z3);
    pw.println("  end loop");
    pw.println("end facet");
  }

  private final void writeRect(PrintWriter pw, double x1, double y1, double z1,
                               double x2, double y2, double z2, double x3,
                               double y3, double z3, double x4, double y4,
                               double z4) {
    writeFacet(pw, x1, y1, z1, x2, y2, z2, x3, y3, z3);
    writeFacet(pw, x1, y1, z1, x2, y2, z2, x4, y4, z4);
  }

  private final void writeBinaryFacet(DataOutputStream dos, float x1, float y1,
                                      float z1, float x2, float y2, float z2,
                                      float x3, float y3, float z3)
      throws IOException {
    dos.writeFloat(x1);
    dos.writeFloat(y1);
    dos.writeFloat(z1);
    dos.writeFloat(x2);
    dos.writeFloat(y2);
    dos.writeFloat(z2);
  }

  private final void writeBinaryRect(DataOutputStream dos, float x1, float y1,
                                     float z1, float x2, float y2, float z2,
                                     float x3, float y3, float z3, float x4,
                                     float y4, float z4) throws IOException {
    writeBinaryFacet(dos, x1, y1, z1, x2, y2, z2, x3, y3, z3);
    writeBinaryFacet(dos, x1, y1, z1, x2, y2, z2, x4, y4, z4);
  }

  public void writeSTL(String filename) throws IOException {
    PrintWriter pw =
        new PrintWriter(new BufferedWriter(new FileWriter(filename)));
    pw.println("solid StevensCAD");
    double x = 0, y = 0, z = 0;
    writeRect(pw, x, y, z, x + side, y + side, z, x + side, y, z, x, y + side,
              z);
    writeRect(pw, x, y, z, x + side, y, z + side, x + side, y, z, x, y,
              z + side);
    pw.println("endsolid StevensCAD");
    pw.close();
  }

  public void writeBinarySTL(String filename) throws IOException {
    DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename));
    // int x = 5    0 0 0 5
    // dos.writeUTF8("binary STL StevensCAD ");
    dos.writeInt(12);
    float x = 0, y = 0, z = 0;
    writeBinaryRect(dos, x, y, z, x + side, y + side, z, x + side, y, z, x,
                    y + side, z);
    writeBinaryRect(dos, x, y, z, x + side, y, z + side, x + side, y, z, x, y,
                    z + side);
    dos.close();
  }

  public String toString() { return "Cube side=" + side; }

  public static void main(String[] args) throws IOException {
    Cube c = new Cube(10); // 10 on each side (0,0,0), (10,0,0) (0, 10,0)
    c.writeSTL("cube.stl");
    c.writeBinarySTL("cube.bstl");
  }
}
