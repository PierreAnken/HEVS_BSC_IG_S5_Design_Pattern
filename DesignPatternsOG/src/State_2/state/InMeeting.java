package State_2.state;

import State_2.context.Person;

public class InMeeting implements State {

	private Person person;
	
	public InMeeting(Person person) {
		this.person = person;
	}
	
	public State ask() {
		return person.getWaitingToSpeakState();
	}

	public State enter() {
		return this;
	}

	public State handover() {
		return this;
	}

	public State leave() {
		System.out.println(person.getName() + " leave");
		return person.getRegisteredState();
	}

	public State over() {
		return this;
	}
}
