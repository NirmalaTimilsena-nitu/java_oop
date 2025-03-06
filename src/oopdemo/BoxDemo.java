package oopdemo;

public class BoxDemo {
	float length, breadth;

	// Default constructor
	public BoxDemo() {
		length = 6;
		breadth = 9;
	}

	// Parameterized constructor
	public BoxDemo(float x, float y) {
		length = x;
		breadth = y;

	}

	BoxDemo(float x) {
		length = breadth = x;
	}

	float area() {
		return length * breadth;
	}

	public static void main(String[] args) {
		BoxDemo bd = new BoxDemo();
		System.out.println("Area :" + bd.area());
		
		BoxDemo bd1 = new BoxDemo(6, 9);
		System.out.println("Area :" + bd1.area());
		
		BoxDemo bd2 = new BoxDemo(6);
		System.out.println("Area :" + bd2.area());

	}

}
