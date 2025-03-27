package string_handling;

public class Concat_String_Example {
	public static void main(String[] args) {

		// create first string
		String first = "Java ";
		System.out.println("First String: " + first);

		// create second
		String second = "547658";
		System.out.println("Second String: " + second);

		// join two strings
		String joinedString = second.concat(first);
		System.out.println("Joined String: " + joinedString);
	}

}
