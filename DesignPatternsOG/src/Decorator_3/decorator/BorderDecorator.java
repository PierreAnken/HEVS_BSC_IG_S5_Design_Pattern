package Decorator_3.decorator;

import Decorator_3.component.Shape;

public class BorderDecorator extends ShapeDecorator {

	int borderThickness;
	
	public BorderDecorator(Shape decoratedShape, int borderThickness) {
		super(decoratedShape);
		this.borderThickness = borderThickness;
	}

	@Override
	public void draw() {
		shape.draw();	       
		setBorderThickness(shape);
	}

	private void setBorderThickness(Shape shape){
		System.out.println(" Border with thickness: " + borderThickness);
	}

}
