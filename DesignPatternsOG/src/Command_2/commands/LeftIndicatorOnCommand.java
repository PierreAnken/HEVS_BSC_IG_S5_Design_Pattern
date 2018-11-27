package Command_2.commands;


import Command_2.Log;
import Command_2.receiver.LeftIndicator;

public class LeftIndicatorOnCommand implements Command {

	LeftIndicator leftIndicator;

	public LeftIndicatorOnCommand(LeftIndicator leftIndicator) {
		this.leftIndicator = leftIndicator;
	}

	public void execute() {
		leftIndicator.on();
	}
	
	public void store() {
		Log.writeLog(" store() " + this.getClass().getName());
	}
}
