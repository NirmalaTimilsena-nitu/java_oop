package looping_statement;

import java.util.Scanner;

public class ForLoopDemo {

	public static void main(String args[]) {
		int num;
		System.out.println("Enter the number :");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			
			System.out.println(i);
		}
	}
}
