package State_2.context;

import State_2.state.*;

public class Person {

	private State registeredState = new Registered(this);
	private State inMeetingState = new InMeeting(this);
	private State speakingState = new Speaking(this);
	private State waitingToSpeakState = new WaitingToSpeak(this);
	private State state = registeredState;
    private String name;

    public Person(String name){
        this.name = name;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public void enter() {
		state = state.enter();
	}
	
	public void leave() {
		state = state.leave();
	}
	
	public void ask() {
		state = state.ask();
	}
	
	public void handOver(){
		state = state.handover();
	}
	
	public void over(){
		state = state.over();
	}	
	
	public State getRegisteredState() {
		return registeredState;
	}

	public State getInMeetingState() {
		return inMeetingState;
	}

	public State getSpeakingState() {
		return speakingState;
	}

	public State getWaitingToSpeakState() {
		return waitingToSpeakState;
	}
}
