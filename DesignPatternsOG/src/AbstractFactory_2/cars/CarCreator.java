package AbstractFactory_2.cars;

import AbstractFactory_2.factories.CarFactory;

public class CarCreator {

    private CarFactory carFactory;

    public CarCreator(CarFactory carFactory) {
        this.carFactory = carFactory;
    }

    public Car orderCar(String color) {
        Car car = createCar();

        car.installEngine();
        car.addExtras();
        car.paint(color);

        return car;
    }

    protected Car createCar() {
        return carFactory.createCar();
    }

}
