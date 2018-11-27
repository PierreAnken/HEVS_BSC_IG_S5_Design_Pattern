package Factory_1.creator;

import Factory_1.cars.Car;
import Factory_1.cars.Pickup;

public class PickupCreator extends CarCreator
{
    @Override
	protected Car createCar() {
		return new Pickup();
	}
}
