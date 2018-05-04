/*
	Write a class to represent fractions.  They should be in a package refelecting the fact that we are at stevens institute of technology, a college, in ee552.

	You should be able to instantiate fractions like 1/2,  6/5,  3/1 where you do not specify the 1.

	Support addition, subtraction and unary negation.
	Use all standard java coding conventions

	This fraction should be a java bean with two attributes numerator and denominator.
 */

public class DivByZero extends Exception {

}


package edu.stevens.ee552;


public class Fraction {
	private int num, den;
	
	public Fraction() {} // Java Bean
	public Fraction(int n, int d) throws DivByZero {
		if (d == 0)
			throw new DivByZero();
	}
	public Fraction(int n) {}
	
	public int getNumerator() { return num; }
	public void setNumerator(int n) { num = n; }

	public int getDenominator() { return den; }
	public void setDenominator(int d) { den = d; }

}


import edu.stevens.ee552.Fraction;
public class TestFraction {
	public static main(String[] args) {
		Fraction a = new Fraction(1,2);
		Fraction b = new Fraction(6,5);
		Fraction c = new Fraction(3);
		Fraction d = a.add(b);
		Fraction e = Fraction.add(a,b);
		//not great		Fraction f = new Fraction();
		//not great		Fraction.add(f, a,b);
	}
}



public abstract class Command {
	public abstract void doit();
	public abstract void undo();	
}

class MyBuffer {
  private StringBuilder b;
	public MyBuffer() { b = new StringBuilder(); }
	public void insert(String text) {
		
    new Command() {
			private String theText;
			public void doit() {
				b.append(text);
				theText = text;
			}
			public void undo() {
        // remove the last theText.size() characters from the buffer
			}
		};
	}
}
//2. Implement an abstract class that supports two methods doit() and undoit.  Write a class InsertText that implements the two methods with doit() inserting text into a buffer and undoit removing that text.
