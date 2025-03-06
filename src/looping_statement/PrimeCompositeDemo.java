package looping_statement;

import java.util.Scanner;

//write a program to Check Whether a Given Number is Prime or Not
public class PrimeCompositeDemo {
	public static void main(String[] args) {
		int i,num, count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number :");
		 num = sc.nextInt();
		for (i = 2; i < num; i++) {
			if (num % i == 0) {
				count++;
				break;
			}
		}
		if (count == 0)
			System.out.println("This is a Prime Number.");
		else
			System.out.println("This is not a Prime Number.");
	}

}
