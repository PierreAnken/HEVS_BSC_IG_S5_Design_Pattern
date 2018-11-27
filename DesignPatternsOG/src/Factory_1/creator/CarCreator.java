package Factory_1.creator;

import Factory_1.cars.Car;

public abstract class CarCreator {

    public Car orderCar(String color) {
        Car car = createCar();

        car.installEngine();
        car.addExtras();
        car.paint(color);

        return car;
    }

	protected abstract Car createCar();

}
