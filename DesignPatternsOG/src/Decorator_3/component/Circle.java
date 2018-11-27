package Decorator_3.component;

public class Circle implements Shape {

	private int diameter;

	public Circle(int diameter) {
		this.diameter = diameter;
	}
	
	@Override
	public void draw() {
		System.out.println("Shape: Circle with diameter " + this.diameter);
	}

}