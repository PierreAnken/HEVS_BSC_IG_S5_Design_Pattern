package Command_2.commands;


import Command_2.Log;
import Command_2.receiver.SpeedControl;

public class SpeedControlOnCommand implements Command {

	SpeedControl speedControl;

	public SpeedControlOnCommand(SpeedControl speedControl) {
		this.speedControl = speedControl;
	}

	public void execute() {
		speedControl.on();
	}
	
	public void store() {
		Log.writeLog(" store() " + this.getClass().getName());
	}
}
