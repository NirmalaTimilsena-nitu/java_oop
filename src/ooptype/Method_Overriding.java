package ooptype;

//if the same method is present in both the superclass and subclass, what will happen?

// The method in the subclass overrides the method in the superclass. 
//This concept is known as method overriding in Java.

class Fruit {
	// method in the superclass
	public void edible() {
		System.out.println(" This fruit is edible");
	}
}

// Orange inherits Fruit
class Orange extends Fruit {
	// overriding the edible() method
	@Override
	public void edible() {
		System.out.println("This is my Favorite");
	}

	// new method in subclass
	public void tasty() {
		System.out.println("Orange is tasty");
	}
}

public class Method_Overriding {
	public static void main(String[] args) {

		// create an object of the subclass
		Orange o = new Orange();

		// call the eat() method
		o.edible();
		o.tasty();
	}
}
