package Command_2.commands;


import Command_2.Log;
import Command_2.receiver.ShortLights;

public class ShortLightsOnCommand implements Command {

	ShortLights shortLights;

	public ShortLightsOnCommand(ShortLights shortLights) {
		this.shortLights = shortLights;
	}

	public void execute() {
		shortLights.on();
	}
	
	public void store() {
		Log.writeLog(" store() " + this.getClass().getName());
	}
}
