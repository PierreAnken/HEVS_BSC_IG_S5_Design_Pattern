package Command_2.commands;


import Command_2.Log;
import Command_2.receiver.SpeedControl;

public class SpeedControlOffCommand implements Command {

	SpeedControl speedControl;
	
	public SpeedControlOffCommand(SpeedControl speedControl) {
		this.speedControl = speedControl;
	}

	public void execute() {
		speedControl.off();
	}
	
	public void store() {
		Log.writeLog(" store() " + this.getClass().getName());
	}
}
