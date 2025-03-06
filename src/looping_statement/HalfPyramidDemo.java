package looping_statement;

import java.util.Scanner;

public class HalfPyramidDemo {
	public static void main(String[] args) {
		int rows;
		System.out.println("Enter desired rows: ");
		Scanner sc = new Scanner(System.in);
		rows = sc.nextInt();
		// outer loop
		for (int i = 1; i <= rows; ++i) {
			// inner loop to print the numbers
			for (int j = 1; j <= i; ++j) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}
}
