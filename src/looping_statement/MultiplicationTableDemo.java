package looping_statement;

import java.util.Scanner;

public class MultiplicationTableDemo {
	public static void main(String[] args) {
		int num, sum;
		System.out.println("Enter any number : ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			//sum = num * i;
			System.out.println(num + "*" + i + "=" + num * i);
		}
	}

}
