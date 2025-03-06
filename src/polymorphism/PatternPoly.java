package polymorphism;

public class PatternPoly {
	public static void main(String[] args) {
		Pattern p = new Pattern();

		// call method without any argument
		p.display();
		System.out.println("\n");

		// call method with a single argument
		p.display('#');
	}

}
