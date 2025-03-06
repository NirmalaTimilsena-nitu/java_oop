package looping_statement;

import java.util.Scanner;

public class DoWhileLoopDemo {
	public static void main(String args[]) {
		int num;
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		int i = 1;
		do {
			System.out.println(i);
			i++;
		} while (i <= num);

	}
}
