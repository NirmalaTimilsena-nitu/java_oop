package exception_handling;

public class MultipleCatchExample {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4,5};

		try {
			// Trying to access an out-of-bounds index
			System.out.println(numbers[5]); // This will throw ArrayIndexOutOfBoundsException

			// Trying to divide by zero (this won't execute due to the previous exception)
			int result = 10 / 0; // This will throw ArithmeticException
			System.out.println(result);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: ArrayIndexOutOfBoundsException.");
		} catch (ArithmeticException e) {
			System.out.println("Error: Division by zero is not allowed.");
		} catch (Exception e) {
			System.out.println("Error: Some other exception occurred.");
		}

		System.out.println("Program continues...");
	}
}
