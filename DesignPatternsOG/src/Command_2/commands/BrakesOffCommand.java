package Command_2.commands;

import Command_2.Log;
import Command_2.receiver.Brakes;

public class BrakesOffCommand implements Command {

	Brakes brakes;
	
	public BrakesOffCommand(Brakes brakes) {
		this.brakes = brakes;
	}

	public void execute() {
		brakes.off();
	}
	
	public void store() {
		Log.writeLog(" store() " + this.getClass().getName());
	}
}
