package abstraction;

public class Area_Demo {
	
	public static void main(String[] args) {
		Shape_Demo rectangle = new Rectangle_Demo(8,9);
		Shape_Demo cir= new Circle_Demo(9);
		
		rectangle.display();
		System.out.println("This is area of rectangle: " +rectangle.area());
		
		cir.display();
		System.out.println("This is area of circle : " + cir.area());
		
	}
	

}
