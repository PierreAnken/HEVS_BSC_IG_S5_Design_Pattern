package Command_2.commands;

import Command_2.Log;
import Command_2.receiver.Clutch;

public class ClutchOnCommand implements Command {

	Clutch clutch;

	public ClutchOnCommand(Clutch clutch) {
		this.clutch = clutch;
	}

	public void execute() {
		clutch.on();
		clutch.changeGear(2);
	}
	
	public void store() {
		Log.writeLog(" store() " + this.getClass().getName());
	}
}
