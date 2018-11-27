package Factory_1.creator;

import Factory_1.cars.Car;
import Factory_1.cars.Coupe;

public class CoupeCreator extends CarCreator
{
    @Override
    protected Car createCar() {
		return new Coupe();
	}
}
