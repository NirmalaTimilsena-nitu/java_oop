package conditional_statement;

import java.util.Scanner;

public class OddEvenNumber {

	public static void main(String[] args) {
		int a;
		System.out.println("Enter a Number:");
		Scanner s = new Scanner(System.in);
		a = s.nextInt();

		if (a % 2 == 0) {

			System.out.println("Given number is Even");
		} else {
			System.out.println("Given Number is odd");
		}

	}

}
