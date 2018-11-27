package Factory_1.creator;

import Factory_1.cars.Car;
import Factory_1.cars.Minivan;

public class MinivanCreator extends CarCreator
{
    @Override
	protected Car createCar() {
		return new Minivan() ;
	}
}
