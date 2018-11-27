package Decorator_2.component;

public class Verbier extends Stay {

	private int cost = 400;

	public Verbier() {

		description = "Verbier";
	}

	@Override
	public int getCost() {
		return cost;
	}

}
