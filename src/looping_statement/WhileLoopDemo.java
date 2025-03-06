package looping_statement;

import java.util.Scanner;

public class WhileLoopDemo {
	public static void main(String args[]) {
		int num, i;
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		i = 1;
		while (i <= num) {
			System.out.println(i);
			i++;
		}

	}
}
