package constructor;

public class No_Args_Constructor {

	int i;

	// constructor with no parameter
	private No_Args_Constructor() {
		i = 5;
		System.out.println("Constructor is called");
	}

	public static void main(String[] args) {

		// calling the constructor without any parameter
		No_Args_Constructor noc = new No_Args_Constructor();
		System.out.println("Value of i: " + noc.i);
	}
}
