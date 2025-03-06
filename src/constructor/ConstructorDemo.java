package constructor;

public class ConstructorDemo {

	 String name;

	// constructor//no args constructor
	public ConstructorDemo() {
		System.out.println("This is Constructor: ");
		name = " NIMS";
	}

	public static void main(String[] args) {
		ConstructorDemo cd = new ConstructorDemo();
		System.out.println(" The name is " + cd.name);
	}

}
