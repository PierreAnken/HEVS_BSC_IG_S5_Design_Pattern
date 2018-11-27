package Decorator_1.decorator;


import Decorator_1.component.Car;

public class AntiSlidingSystemDecorator extends OptionsDecorator {

    protected static final String DESCRIPTION = "anti-sliding system";
    protected static final int SECURITY_LEVEL = 4;
    protected static final int PRICE = 2300;

    private Car car = null;
    
    public AntiSlidingSystemDecorator(Car car) {
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
