package Decorator_3.decorator;

import Decorator_3.component.Shape;

public abstract class ShapeDecorator implements Shape {

	protected Shape shape;
	
	public ShapeDecorator(Shape decoratedShape){
		this.shape = decoratedShape;
	}

	@Override
	abstract public void draw();

}
