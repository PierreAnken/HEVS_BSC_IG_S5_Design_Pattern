package Decorator_3.component;

public class Square implements Shape {

	int width;
	
	public Square(int width) {
		this.width = width;
	}
	
	@Override
	public void draw() {
		System.out.println("Shape: Square with width " + width);
	}

}