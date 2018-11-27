package Decorator_1.decorator;


import Decorator_1.component.Car;

public class BreakingSystemDecorator extends OptionsDecorator {

    protected static final String DESCRIPTION = "breaking system";
    protected static final int SECURITY_LEVEL = 2;
    protected static final int PRICE = 1200;

    private Car car = null;
    
    public BreakingSystemDecorator(Car car) {
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
