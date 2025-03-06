package conditional_statement;

import java.util.Scanner;

public class Group_SwitchDemo {
	public static void main(String args[]) {
		char c;
		System.out.println("Enter The Character : ");
		Scanner sc = new Scanner(System.in);
		c = sc.next().charAt(0);

		switch (c) {
		case 'a':
		case 'e':
		case 'i':
		case '0':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println(c + " is a Vowels");
			break;
		default:
			System.out.println(c + " is Consonant");
			break;
		}

	}

}
