package Command_1.commands;

import Command_1.receiver.Car;

public class BackwardCommand implements Command {
	
	public BackwardCommand(Car car) {
		this.myCar = car;
	}

	public void execute() {
		myCar.backward();
	}

	public void undo() {
		myCar.forward();
	}

	private Car myCar;

}