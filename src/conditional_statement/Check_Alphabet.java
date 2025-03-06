package conditional_statement;

//Write a program to check whether a character is alphabet or not
import java.util.Scanner;

class Check_Alphabet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char ch = sc.next().charAt(0);

		if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
			System.out.println("Given character is Alphabet");
		} else {
			System.out.println("Given character is not alphabet");
		}

	}
}

