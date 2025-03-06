package conditional_statement;

import java.util.Scanner;

/*
Nested if Statement
A company insures its drivers in the following cases:
    a.	If the driver is married.
    b.	If the driver is unmarried, male & above 30 years of age.
    c.	If the driver is unmarried, female & above 25 years of age.
*/

public class Nested_If {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Marital Status: ");
		char marital = sc.next().charAt(0);
		if (marital == 'u' || marital == 'U') {
			System.out.println("Enter The Gender M/F: ");
			char gender = sc.next().charAt(0);
			System.out.println("Enter The Age : ");
			int age = sc.nextInt();
			if ((gender == 'M' || gender == 'm') && age >= 30) {
				System.out.println("You are Eligible for Insurance");
			} else if ((gender == 'F' || gender == 'f') && age >= 25) {
				System.out.println("You are Eligible for Insurance");
			} else {
				System.out.println("You are Not Eligible for Insurance");
			}

		} else if (marital == 'm' || marital == 'M') {
			System.out.println("You are Eligible for Insurance");
		} else {
			System.out.println("Invalid Input");
		}
	}

}
