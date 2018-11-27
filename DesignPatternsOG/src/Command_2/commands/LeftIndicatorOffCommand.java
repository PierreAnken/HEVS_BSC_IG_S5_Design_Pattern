package Command_2.commands;

import Command_2.Log;
import Command_2.receiver.LeftIndicator;

public class LeftIndicatorOffCommand implements Command {

	LeftIndicator leftIndicator;
	
	public LeftIndicatorOffCommand(LeftIndicator leftIndicator) {
		this.leftIndicator = leftIndicator;
	}

	public void execute() {
		leftIndicator.off();
	}
	
	public void store() {
		Log.writeLog(" store() " + this.getClass().getName());
	}
}
