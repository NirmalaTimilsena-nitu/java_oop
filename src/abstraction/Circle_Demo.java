package abstraction;

public class Circle_Demo extends Shape_Demo {
	private double radius;

	public Circle_Demo(double radius) {
        this.radius = radius;
    }

	// Implementing abstract method
	public double area() {
		return Math.PI * radius * radius;
	}

}
