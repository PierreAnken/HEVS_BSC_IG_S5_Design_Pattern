package Decorator_2.component;

public abstract class Stay {

	protected String description;
	
	public Stay() {
	}

	public String getDescription() {
		return description;
	}

	public abstract int getCost();

}
