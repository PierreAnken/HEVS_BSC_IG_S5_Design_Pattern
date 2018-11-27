package Command_2.commands;


import Command_2.Log;
import Command_2.receiver.RightIndicator;

public class RightIndicatorOffCommand implements Command {

	RightIndicator rightIndicator;
	
	public RightIndicatorOffCommand(RightIndicator rightIndicator) {
		this.rightIndicator = rightIndicator;
	}

	public void execute() {
		rightIndicator.off();
	}
	
	public void store() {
		Log.writeLog(" store() " + this.getClass().getName());
	}
}