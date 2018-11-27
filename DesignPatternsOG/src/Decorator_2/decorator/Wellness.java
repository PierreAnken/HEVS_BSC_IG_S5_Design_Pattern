package Decorator_2.decorator;


import Decorator_2.component.Stay;

public class Wellness extends ServiceDecorator{

	private Stay myStay;
	private int cost;
	private String description;

	public Wellness(Stay stay) {
		this.myStay = stay;
		this.cost = 150;
		this.description = "Wellness";

	}

	@Override
	public int getCost() {
		return myStay.getCost() + cost;
	}

	@Override
	public String getDescription() {
		return myStay.getDescription() + " , " + description;
	}

}