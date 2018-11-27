package Composite_1.component;

public class Player implements Playable {

	private int name;
	
	public Player(int name) {
		this.name = name;
	}

	public void cry() {
		System.out.println(name + " is crying");
	}

	public void enterField() {
		System.out.println(name + " is entering field");
	}

	public void shoot() {
		System.out.println(name + " is shooting");		
	}

	public void simulateInjury() {
		System.out.println(name + " is simulating an Injury");
	}
}
