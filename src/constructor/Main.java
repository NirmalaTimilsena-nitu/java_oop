package constructor;

public class Main {
	private String name;

	// constructor
	Main() {
		System.out.println("Constructor Called:");
		name = "Nims";
	}

	public static void main(String[] args) {

		// constructor is invoked while
		// creating an object of the Main class
		Main obj = new Main();
		System.out.println("The name is " + obj.name);
	}

}

//Types of Constructor
//In Java, constructors can be divided into three types:
//
//No-Arg Constructor
//Parameterized Constructor
//Default Constructor