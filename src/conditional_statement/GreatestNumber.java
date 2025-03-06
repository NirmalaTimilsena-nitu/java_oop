package conditional_statement;

//write a java program to find the greatest number among three numbers.
import java.util.Scanner;

public class GreatestNumber {
	public static void main(String[] args) {
		float a, b, c;
		System.out.println("Enter three numbers :");
		Scanner sc = new Scanner(System.in);
		a = sc.nextFloat();
		b = sc.nextFloat();
		c = sc.nextFloat();

		if (a > b && a > c) {
			System.out.println("A is Greatest Number:" + a);
		} else if (b > c && b > a) {
			System.out.println("B is greatest Number :" + b);
		} else {
			System.out.println("C is greatest Number: " + c);
		}

	}

}
