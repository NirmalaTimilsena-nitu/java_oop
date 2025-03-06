package looping_statement;

import java.util.Scanner;

//Write a program to find the sum and average of given n numbers.
public class Sum_Avg_Demo {
	public static void main(String[] args) {
		int num, sum = 0, a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Limit: ");
		num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			System.out.println("Enter The Number " + i + ": ");
			a = sc.nextInt();
			sum += a;// sum=sum+a;
		}
		System.out.println("The sum of given numbers is : " + sum);
		System.out.println("The Average of given numbers is : " + sum / num);
	}

}
