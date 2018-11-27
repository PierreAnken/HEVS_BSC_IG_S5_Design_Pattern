package State_2.state;

import State_2.context.Person;

public class Speaking implements State {

	private Person person;
	
	public Speaking(Person person) {
		this.person = person;
	}
	
	public State ask() {
		return this;
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
		System.out.println(person.getName() + " over");
		return person.getInMeetingState();
	}
}
