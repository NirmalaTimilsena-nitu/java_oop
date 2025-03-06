package polymorphism;

//// Example of Overriding in Java
class Animal1 {
	// Base class
	void move() {
		System.out.println("Animal is moving.");
	}

	void eat() {
		System.out.println("Animal is eating.");
	}
}

class Dog1 extends Animal1 {

	void move() {
		System.out.println("Dog is running.");
	}

	void bark() {
		System.out.println("Dog is barking.");
	}
}

public class Method_Overriding_demo {
	public static void main(String[] args) {
		Dog1 d1 = new Dog1();
		d1.move(); 
		d1.eat(); 
		d1.bark(); 
	}
}
