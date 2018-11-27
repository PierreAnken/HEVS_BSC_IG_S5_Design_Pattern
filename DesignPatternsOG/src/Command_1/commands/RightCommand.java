package Command_1.commands;

import Command_1.receiver.Car;

public class RightCommand implements Command {
	
	public RightCommand(Car car) {
		this.myCar = car;
	}
	
	public void execute() {
		myCar.right();
	}

	public void undo() {
		myCar.left();
	}

	private Car myCar;

}