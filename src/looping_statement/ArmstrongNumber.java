package looping_statement;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int num, number, temp, total = 0;
		System.out.println("Enter Any  Number: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		number = num;

//		for (; number != 0; number /= 10) {
//			temp = number % 10;
//			total = total + temp * temp * temp;
//		}
		while(number!=0) {
			temp =number%10;
			total += Math.pow(temp, 3);
			number/=10;
			
		}

		if (total == num)
			System.out.println(num + " is an Armstrong number");
		else
			System.out.println(num + " is not an Armstrong number");
	}

}
