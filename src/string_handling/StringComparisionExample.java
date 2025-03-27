package string_handling;

public class StringComparisionExample {
	public static void main(String[] args) {

		// create 3 strings
		String first = "java programming";
		String second = "java programming";
		String third = "python programming";

		// compare first and second strings
		boolean res1 = first.equals(second);
		System.out.println("Strings first and second are equal: " + res1);

		// compare first and third strings
		boolean res2 = first.equals(third);
		System.out.println("Strings first and third are equal: " + res2);
	}

}
