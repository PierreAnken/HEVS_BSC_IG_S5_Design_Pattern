package AbstractFactory_2.factories;

import AbstractFactory_2.cars.*;

public class CoupeFactory implements CarFactory {

    public Car createCar() {
        return new Coupe();
    }

}
