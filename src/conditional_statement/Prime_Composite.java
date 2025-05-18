package conditional_statement;

import java.util.Scanner;

public class Prime_Composite {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = scn.nextInt();
// this is optional 
		if (n == 1) {
			System.out.println("No is neither prime nor composite");
			return;
		}

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				System.out.println("No is composite");
				return;
			}
		}

		System.out.println("No is prime");
	}
}
