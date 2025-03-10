package inheritance;

class One {
	public void printOne() {
		System.out.println("printOne() method of One class.");
	}
}

class Two extends One {
	public void printTwo() {
		System.out.println("printTwo() method of Two class.");
	}
}

public class Multilevel_Inheritance_Demo extends Two {
	public static void main(String args[]) {
		// Creating object of the derived class (Main)
		Multilevel_Inheritance_Demo md = new Multilevel_Inheritance_Demo();

		// Calling methods
		md.printOne();
		md.printTwo();
	}
}
