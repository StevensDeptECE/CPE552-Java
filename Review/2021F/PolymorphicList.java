    Shape  {}
class Line /* inherits! */    {}
class Rect /* inherits! */  {}

public class PolymorphicList {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[3]; // create an ARRAY of 3 shapes

		//  shapes[0] = null
		//	shapes[1] = null
		//	shapes[2] = null

		shapes[0] = new Line(1, 14,    93, 76); // x1,y1,   x2,y2
    shapes[1] = new Rect(30,40, 10,15); //x=30,y=40, w=10,h=15
		shapes[2] = new Line(50, 20,   80, 120);
	
		for (int i = 0; i < shapes.length; i++)
			System.out.println(shapes[i].area());

		// write another way of traversing the array 




	}

}
