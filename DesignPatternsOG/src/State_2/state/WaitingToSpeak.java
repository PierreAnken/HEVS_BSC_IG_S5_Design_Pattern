package State_2.state;

import State_2.context.Person;

public class WaitingToSpeak implements State {

	private Person person;
	
	public WaitingToSpeak(Person person) {
		this.person = person;
	}
	
	public State ask() {
		return this;
	}

	public State enter() {
		return this;
	}

	public State handover() {
		System.out.println(person.getName() + " Handover");
		return person.getSpeakingState();
	}

	public State leave() {
		System.out.println(person.getName() + " Leave");
		return person.getRegisteredState();
	}

	public State over() {
		return this;
	}
}
