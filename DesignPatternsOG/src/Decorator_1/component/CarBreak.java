package Decorator_1.component;

public class CarBreak extends Car {

    protected static final int SECURITY_LEVEL = 50;
    protected static final int PRICE = 30000;
    
    public CarBreak() {
        this.description = "Break";
    }

    public int getCost() {
        return PRICE;
    }

    public int getSecurityLevel() {
        return SECURITY_LEVEL;
    }
    
}
