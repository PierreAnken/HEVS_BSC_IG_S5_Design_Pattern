package Command_2.commands;


import Command_2.Log;
import Command_2.receiver.RightIndicator;

public class RightIndicatorOnCommand implements Command {

	RightIndicator rightIndicator;

	public RightIndicatorOnCommand(RightIndicator rightIndicator) {
		this.rightIndicator = rightIndicator;
	}

	public void execute() {
		rightIndicator.on();
	}
	
	public void store() {
		Log.writeLog(" store() " + this.getClass().getName());
	}
}
