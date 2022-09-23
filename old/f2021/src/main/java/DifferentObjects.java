import java.util.ArrayList;

public class DifferentObjects {
	public static void main(String[] args) {
		ArrayList<Food> foods = new ArrayList();
		foods.add(new JunkFood("Chips", 1.50));
		foods.add(new HealthyFood("Carrots", 1.00));
		//foods.add(new VegetarianFood("broccoli", 2.00));

		for (Food f : foods) {
			System.out.println(f.pay());
		}
	}
}


// parent (object-oriented) = base class (C++/Java)
// abstract class = class with at least 1 abstract method
// abstract class CANNOT BE INSTANTIATED
abstract class Food {
	private String name;
	protected double price;
	public Food(String name, double price) {
		this.name = name;
		this.price = price;
	}
	abstract public double pay();
	public String getName() { return name; }
	public void setName(String n) { name = n; }
}

// child class (object-oriented) = derived class (C++/Java)
class JunkFood extends Food {
	public JunkFood(String name, double price) {
		super(name, price);
	}

	public double pay() {
		return  price * 1.07;
	}
}

class HealthyFood extends Food {
	public HealthyFood(String name, double price) {
		super(name, price);
	}
	public double pay() {
		return price;
	} 
}

// if the child class does not implement the abstract method, it inherits it
// and is abstract

abstract class VegetarianFood extends Food {
	public VegetarianFood(String name, double price) {
		super(name, price);
	}
}
