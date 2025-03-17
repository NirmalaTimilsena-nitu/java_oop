package inheritance;

class Animal1 {
	void eat() {
		System.out.println("eating...");
	}
}

class Dog2 extends Animal1{
	void bark() {
		System.out.println("barking...");
	}
}

public class Single_Inheritance_Demo {
	public static void main(String args[]) {
		Dog2 d = new Dog2();
		d.bark();
		d.eat();
	}
}
