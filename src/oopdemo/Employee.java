package oopdemo;

public class Employee {
	int id;
	String name;
	String address;

	// Creating parameterized constructor
	Employee(int i, String n, String a) {
		id = i;
		name = n;
		address = a;  
	}
	// method to display values
	void display() {
		System.out.println(id + " " + name + " " + address);
	}

	public static void main(String[] args) {
		// creating objects and passing values
		Employee e1 = new Employee(1, "Prashant", "Kumaripati");
		Employee e2 = new Employee(2, " Prastha", "Basantapur");
		// calling method to diplay the values of object
		e1.display();
		e2.display();

	}
}
