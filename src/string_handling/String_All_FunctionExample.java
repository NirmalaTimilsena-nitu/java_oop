package string_handling;

public class String_All_FunctionExample {
	public static void main(String[] args) {
		String s1 = "NIMS College";
		String s2 = "NIMS College";
		String s3 = "NIMS ";
		boolean x = s1.equals(s2);
		System.out.println("Compare s1 and s2:" + x);
		System.out.println("Character at given position is:" + s1.charAt(5));
		System.out.println(s1.concat(" is College "));
		System.out.println(s1.length());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.substring(0, 4));
		System.out.println(s1.substring(4));
	}

}
