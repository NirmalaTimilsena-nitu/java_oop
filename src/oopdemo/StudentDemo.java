package oopdemo;

//to initialize the values from one object to another object.
public class StudentDemo {
	int id;
	String name;
	String address;
	
// Creating parameterized constructor
// constructor to initialize integer and string
	public StudentDemo(int i, String n, String a) {
		id = i;
		name = n;
		address = a;
	}

	// constructor to initialize another object
	public StudentDemo(StudentDemo sd) {
		id = sd.id;
		name = sd.name;
		address = sd.address;

	}

	void display() {
		System.out.println(id + "" + name + "" + address);
	}

	public static void main(String[] args) {
		StudentDemo sd1 = new StudentDemo(1, "Prashant", "Kumaripati");
		StudentDemo sd2 = new StudentDemo(sd1);
		sd1.display();
		sd2.display();
	}

}
