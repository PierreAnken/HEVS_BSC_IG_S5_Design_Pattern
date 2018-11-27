package AbstractFactory_2.factories;

import AbstractFactory_2.cars.*;

public class MinivanFactory implements CarFactory {

    public Car createCar() {
        return new Minivan();
    }

}
