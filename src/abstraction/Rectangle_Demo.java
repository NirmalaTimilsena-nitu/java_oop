package abstraction;

public class Rectangle_Demo extends Shape_Demo {

	private double length;
	private double width;

	public Rectangle_Demo(double len, double wid) {
		this.length = len;
		this.width = wid;
	}

	// Implementing abstract method
	public double area() {
		return length * width;
	}

}
