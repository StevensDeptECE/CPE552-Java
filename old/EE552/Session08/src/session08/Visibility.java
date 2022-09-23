package session08;

/**
 * @author dkruger
 */
public class Visibility {
  private int x; // data should always be private
  public void setX(int x) { this.x = x; }
  public  int getX() { return x; }
}

class Rectangle {
    public int x,y, width, height;

}

class Complex {
    public double real, imag;
}


