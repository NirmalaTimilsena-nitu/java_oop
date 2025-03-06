package looping_statement;

import java.util.Scanner;

//Write a Java program that checks whether a given year is 
//a leap year or not.
public class LeapYear {
	public static void main(String[] args) {
		int year;
		System.out.println("Enter a year : ");
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();

		if (year % 4 == 0 || (year % 100 == 0 && year % 400 == 0)) {
			System.out.println("The Year " + year + " is leap year");
		} else {
			System.out.println("The Year " + year + " is not leap year");
		}
	}
}
