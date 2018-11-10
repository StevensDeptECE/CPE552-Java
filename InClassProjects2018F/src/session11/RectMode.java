package session11;

/**
 *
 * @author dkruger
 */
public class RectMode extends Mode {
    public Shape create(int x, int y, int w, int h) {
        return new Rect(x,y,w,h);
    }
}
            
