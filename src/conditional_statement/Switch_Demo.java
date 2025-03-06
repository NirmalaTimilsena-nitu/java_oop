package conditional_statement;

import java.util.Scanner;

//Switch Case Statement in Java
public class Switch_Demo {
	public static void main(String args[]) {
		int num1, num2, p, ch;
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("Enter your choice :");
		Scanner sc = new Scanner(System.in);
		ch = sc.nextInt();
		System.out.println("Enter any two numbers: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		switch (ch) {
		case 1:
			p = num1 + num2;
			System.out.println("Addition :" + p);
			break;
		case 2:
			p = num1 - num2;
			System.out.println("Subtraction :" + p);
			break;
		case 3:
			p = num1 * num2;
			System.out.println("Multiplication :" + p);
			break;
		case 4:
			p = num1 / num2;
			System.out.println("Division :" + p);
			break;
		default:
			System.out.println("Invalid Choice:");
			break;
		}
	}
}
