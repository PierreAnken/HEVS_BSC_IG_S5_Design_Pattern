package Command_1.commands;

import Command_1.receiver.Car;

public class ForwardCommand implements Command {
	
	public ForwardCommand(Car car) {
		this.myCar = car;
	}

	public void execute() {
		myCar.forward();
	}

	public void undo() {
		myCar.backward();
	}

	private Car myCar;

}