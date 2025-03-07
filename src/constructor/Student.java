package constructor;

//Constructor_Overload_Example
public class Student {
	int id;
	String name;

	// Default Constructor
	Student() {
		id = 100;
		name = "John";
	}

	// Parameterized Constructor
	Student(int i, String n) {
		id = i;
		name = n;
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student(101, "David");
		System.out.println(s1.id + " " + s1.name);
		System.out.println(s2.id + " " + s2.name);
	}
}
