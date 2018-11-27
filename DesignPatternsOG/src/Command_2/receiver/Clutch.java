package Command_2.receiver;

public class Clutch {

	int gear = 0;
	
	public void on() {
		System.out.println("Car clutch is on.");
	}

	public void off() {
		System.out.println("Car clutch is off.");
	}

	public void changeGear(int gear)
	{
		this.gear = gear;
		System.out.println("Car gear is set to " + this.gear);
	}
}
