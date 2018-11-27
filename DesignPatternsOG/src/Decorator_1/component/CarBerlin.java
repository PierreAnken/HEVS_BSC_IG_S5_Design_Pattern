package Decorator_1.component;

public class CarBerlin extends Car {

    protected static final int SECURITY_LEVEL = 40;
    protected static final int PRICE = 40000;
    
    public CarBerlin() {
        this.description = "Berlin";
    }

    public int getCost() {
        return PRICE;
    }

    public int getSecurityLevel() {
        return SECURITY_LEVEL;
    }
    
}
