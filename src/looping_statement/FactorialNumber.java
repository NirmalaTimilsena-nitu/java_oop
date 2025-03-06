package looping_statement;

import java.util.Scanner;

//Write a program to find the factorial of given number.

public class FactorialNumber {
	public static void main(String args[]) {
		int num, fact = 1;
		System.out.println("Enter the number : ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + num + " is : " + fact);

	}

}
