package interface_example;

//Interface Inheritance
interface Printable {
	void print();
}

interface Showable extends Printable {
	void show();
}

class InterfaceExample implements Showable {
	public void print() {
		System.out.println("Hello");
	}

	public void show() {
		System.out.println("Welcome");
	}

	public static void main(String args[]) {
		InterfaceExample obj = new InterfaceExample();
		obj.print();
		obj.show();
	}
}