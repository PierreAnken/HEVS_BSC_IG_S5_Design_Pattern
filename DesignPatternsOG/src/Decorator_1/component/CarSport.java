package Decorator_1.component;

public class CarSport extends Car {

    protected static final int SECURITY_LEVEL = 30;
    protected static final int PRICE = 35000;
    
    public CarSport() {
        this.description = "Sport";
    }

    public int getCost() {
        return PRICE;
    }

    public int getSecurityLevel() {
        return SECURITY_LEVEL;
    }
    
}
