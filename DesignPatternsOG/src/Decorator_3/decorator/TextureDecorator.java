package Decorator_3.decorator;

import Decorator_3.component.Shape;

public class TextureDecorator extends ShapeDecorator {

	String texture;
	
	public TextureDecorator(Shape decoratedShape, String texture) {
		super(decoratedShape);
		this.texture = texture;
	}

	@Override
	public void draw() {
		shape.draw();	       
		setTexture(shape);
	}

	private void setTexture(Shape shape){
		System.out.println(" Texture: " + texture);
	}
	
}
