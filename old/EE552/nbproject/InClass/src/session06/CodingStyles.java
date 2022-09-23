//package edu.stevens.ee552;
// all packages lowercase

package session06;

/**
 * Explain your class here, a few sentences.
 * Do not use the word class, object, that's obvious
 * @author dkruger
 */
public class CodingStyles {
  private int data; // should always be private
  private int lengthOfPublicKey; // use clear names
  // explain what your data is for
  
  /**
   * Explain each public method
   * @return 
   */
  public int getData() { return data; }
  public void setData(int v) { data = v; }
  public void method() { } // make this public if you want to support it
  private void method2() {}  // this method just for me...
  
  // REMEMBER: You can always make it public LATER.  You can't take it back
  
  public Constructor() {
    ActionListener[] a = { 
      { new CE(), new PlusMinus(), }
      
    };
    
  }
  
  
  public class Add implements ActionListener{
    public void actionPerformedActionEvent e) { result +=   }
  }
}

/* public data exception:  with well-defined math classes, you might  get away with this!
class Rectangle {
public int x,y,width,height; 

}
*/




