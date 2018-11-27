package Decorator_1.decorator;


import Decorator_1.component.Car;

public class ColorDecorator extends OptionsDecorator {

    protected static final String DESCRIPTION = "color of the decorator";
    protected static final int SECURITY_LEVEL = 0;
    protected static final int PRICE = 1340;

    private Car car = null;
    
    public ColorDecorator(Car car) {
        this.car = car;
    }

    public String getDescription() {
        return this.car.getDescription() + ", " + DESCRIPTION;
    }

    public int getCost() {
        return this.car.getCost() + PRICE;
    }

    public int getSecurityLevel() {
        return this.car.getSecurityLevel() + SECURITY_LEVEL;
    }
    
}
