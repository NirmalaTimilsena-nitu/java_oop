package exception_handling;

public class Try_catchExample {

	public static void main(String[] args) {
		try {
			// code that generate exception
			int divideByZero = 5 / 0;
			System.out.println("Rest of code in try block");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException => " + e.getMessage());
		}
	}
}
