package Composite_1.composite;

import Composite_1.component.Playable;
import java.util.ArrayList;
import java.util.List;

public class Team implements Playable {

	public void add(Playable p) {
		myPlayers.add(p);
	}
	
	public void remove(Playable p) {
		myPlayers.remove(p);
	}
	
	public void cry() {
		for (Playable p : myPlayers) 
			p.cry();
	}

	public void enterField() {
		for (Playable p : myPlayers) 
			p.enterField();
	}

	public void shoot() {
		for (Playable p : myPlayers) 
			p.shoot();
	}

	public void simulateInjury() {
		for (Playable p : myPlayers) 
			p.simulateInjury();
	}

	private List<Playable> myPlayers = new ArrayList<Playable>();
}
