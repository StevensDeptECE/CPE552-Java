package session11;

/**
 *
 * @author dkruger
 */
public class TestDrawing {
    public static void main(String[] args) {
        Drawing d = new Drawing(800,500);
        DrawArea da = d.getDrawArea();
        da.addRect(400,250,100,100);
    }
}
