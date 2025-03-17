package datahandling;

import java.util.Scanner;
import java.util.Arrays;

public class SortAndDisplay {
	public static void main(String[] args) {
		// Create a Scanner object for input
		Scanner scanner = new Scanner(System.in);

		// Create an array to hold 10 integers
		int[] numbers = new int[10];

		// Prompt the user to enter 10 integers
		System.out.println("Please enter 10 integers:");

		// Read 10 integers from the user
		for (int i = 0; i < 10; i++) {
			numbers[i] = scanner.nextInt();
		}

		// Sort the array
		Arrays.sort(numbers);

		// Display the sorted array
		System.out.println("Sorted numbers: " + Arrays.toString(numbers));

		// Display the minimum and maximum values
		System.out.println("Minimum number: " + numbers[0]);
		System.out.println("Maximum number: " + numbers[9]);

		// Close the scanner to avoid resource leaks
		scanner.close();
	}
}
