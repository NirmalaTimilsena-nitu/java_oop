package ooptype;


//inherit from Vehicle
class Bike extends Vehicle {
	// new method in subclass
	public void display() {
		System.out.println("model name: " + name);
	}
	public void start() {
		System.out.println("Engine is starting:" +engine);
	}
}

class Main {
	public static void main(String[] args) {
		// create an object of the subclass
		Bike b = new Bike();
		// access field of superclass
		b.name = "honda";
		b.engine="ABC";
		b.display();
		b.start();
		// call method of superclass
		// using object of subclass
		b.run();
	}
}
