package Command_2.commands;

import Command_2.Log;
import Command_2.receiver.Brakes;

public class BrakesOnCommand implements Command {

	Brakes brakes;

	public BrakesOnCommand(Brakes brakes) {
		this.brakes = brakes;
	}

	public void execute() {
		brakes.on();
	}
	
	public void store() {
		Log.writeLog(" store() " + this.getClass().getName());
	}
}
