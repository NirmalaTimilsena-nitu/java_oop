package polymorphism;

class Computer {

	// overridden method
	public void display() {
		System.out.println("This is Computer");
	}
}

class MobilePhone extends Computer {

	// overriding method
	@Override
	public void display() {
		System.out.println("This is new mobile phone");
	}

	public void printMessage() {

		// this calls overriding method
		display();

		// this calls overridden method
		super.display();
	}
}

public class SuperKeyword_Demo {
	public static void main(String[] args) {
		MobilePhone mp = new MobilePhone();
		mp.printMessage();
	}
}
