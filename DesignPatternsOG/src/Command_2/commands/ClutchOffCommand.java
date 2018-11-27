package Command_2.commands;

import Command_2.Log;
import Command_2.receiver.Clutch;

public class ClutchOffCommand implements Command {

	Clutch clutch;
	
	public ClutchOffCommand(Clutch clutch) {
		this.clutch = clutch;
	}

	public void execute() {
		clutch.off();
	}
	
	public void store() {
		Log.writeLog(" store() " + this.getClass().getName());
	}
}
