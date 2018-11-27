package Command_1.commands;

import Command_1.receiver.Car;

public class LeftCommand implements Command {

	public LeftCommand(Car car) {
		this.myCar = car;
	}

	public void execute() {
		myCar.left();
	}

	public void undo() {
		myCar.right();
	}

	private Car myCar;

}