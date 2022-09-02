import java.util.*;
import java.util.regex.*;

public class HWParsingCalc {
  public static void main(String[] args) {
		Stack<Double> s = new Stack<>(); // push() pop() isEmpty()
		Scanner s = new Scanner(System.in);
		// read in each token from the keyboard
		// if it's a number, push on the stack
		// if it's an operator then if + pop 2 numbers off the stack and add
		// if - pop 2 numbers off the stack and subtract
		//print the answer
		// you do not have to check for errors
		// 2 3 +  --> print 5
		// 2 3 + 4 - --> print 1
		// 2 3 4 --> print 4 3 2
	}
}
