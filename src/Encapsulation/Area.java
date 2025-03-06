package Encapsulation;

public class Area {
	int length;
	int breadth;

	Area(int length, int b) {
		this.breadth = b;
		this.length = length;
	}

	public void getArea() {
		int rectangular = length * breadth;
		System.out.println("Area of Rectangular : " + rectangular);

	}

}
