package interface_example;

//this is the example of multiple inheritance through interface
interface Bank {
	void rateOfInterest();
}

interface Finance {
	void rateOfInterest();
}

public class Multiple_Inheritance_Example implements Bank, Finance {
	public void rateOfInterest() {
		System.out.println("Sample Rate Of interest");
	}

	public static void main(String args[]) {
		Multiple_Inheritance_Example obj = new Multiple_Inheritance_Example();
		obj.rateOfInterest();
	}
}