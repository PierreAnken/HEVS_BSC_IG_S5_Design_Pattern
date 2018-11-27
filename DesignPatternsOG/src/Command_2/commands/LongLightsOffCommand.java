package Command_2.commands;


import Command_2.Log;
import Command_2.receiver.LongLights;

public class LongLightsOffCommand implements Command {

	LongLights longLights;
	
	public LongLightsOffCommand(LongLights longLights) {
		this.longLights = longLights;
	}

	public void execute() {
		longLights.off();
	}
	
	public void store() {
		Log.writeLog(" store() " + this.getClass().getName());
	}
}
