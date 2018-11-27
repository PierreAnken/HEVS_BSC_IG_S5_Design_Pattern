package Decorator_2.decorator;

import Decorator_2.component.Stay;

public class SkiPass extends ServiceDecorator {

	private Stay myStay;
	private int cost;
	private String description;

	public SkiPass(Stay stay) {
		this.myStay = stay;
		this.cost = 50;
		this.description = "Ski Pass";

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
