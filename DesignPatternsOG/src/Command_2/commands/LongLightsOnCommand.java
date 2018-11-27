package Command_2.commands;


import Command_2.Log;
import Command_2.receiver.LongLights;

public class LongLightsOnCommand implements Command {

	LongLights longLights;

	public LongLightsOnCommand(LongLights longLights) {
		this.longLights = longLights;
	}

	public void execute() {
		longLights.on();
	}
	
	public void store() {
		Log.writeLog(" store() " + this.getClass().getName());
	}
}
