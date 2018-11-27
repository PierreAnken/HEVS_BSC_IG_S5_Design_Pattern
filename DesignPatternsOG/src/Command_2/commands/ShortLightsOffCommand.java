package Command_2.commands;


import Command_2.Log;
import Command_2.receiver.ShortLights;

public class ShortLightsOffCommand implements Command {

	ShortLights shortLights;
	
	public ShortLightsOffCommand(ShortLights shortLights) {
		this.shortLights = shortLights;
	}

	public void execute() {
		shortLights.off();
	}
	
	public void store() {
		Log.writeLog(" store() " + this.getClass().getName());
	}
}