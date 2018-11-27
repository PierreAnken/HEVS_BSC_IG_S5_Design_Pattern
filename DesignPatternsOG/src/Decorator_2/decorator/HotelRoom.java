package Decorator_2.decorator;

import Decorator_2.component.Stay;

public class HotelRoom extends ServiceDecorator {

	private Stay myStay;
	private int cost;
	private String description;

	public HotelRoom(Stay stay) {
		this.myStay = stay;
		this.cost = 200;
		this.description = "Hotel Room";

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