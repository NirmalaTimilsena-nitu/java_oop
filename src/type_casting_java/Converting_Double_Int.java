package type_casting_java;
//Narrowing Type Casting/Explicit Type Casting./Downcasting

public class Converting_Double_Int {
	public static void main(String[] args) {
		// create double type variable
		double num = 10.99;
		System.out.println("The double value: " + num);

		// convert into int type
		int data = (int) num;
		System.out.println("The integer value: " + data);
	}

}