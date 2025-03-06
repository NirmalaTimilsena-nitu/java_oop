package polymorphism;

public class MethodOverloading_Demo {
	// Method to add two integers
	public int add(int a, int b) {
		return a + b;
	}
	// Method to add three integers
	public int add(int a, int b, int c) {
		return a + b + c;
	}
	// Method to add two doubles
	public double add(double a, double b) {
		return a + b;
	}
	// Method to concatenate two strings
	public String add(String a, String b) {
		return a + b;
	}
	public static void main(String[] args) {
		MethodOverloading_Demo mod = new MethodOverloading_Demo();
		// Calling the overloaded methods
		System.out.println("Sum of a and b is: " + mod.add(5, 10));
		System.out.println("Sum of a, b, and c is: " + mod.add(5, 10, 15));
		System.out.println("Sum of a and b is: " + mod.add(3.5, 2.7));
		System.out.println("Concatenation of 'Hello' and 'World' is: " + mod.add("Hello", "World"));
	}
}
