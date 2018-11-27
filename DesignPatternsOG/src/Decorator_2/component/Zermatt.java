package Decorator_2.component;

public class Zermatt extends Stay {
	
	private int cost = 500;
	
	public Zermatt() {
		description = "Zermatt";
	}

	@Override
	public int getCost() {
		return cost;
	}

}
