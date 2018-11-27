package Decorator_1.component;

public abstract class Car {

    protected String description = "";

    public String getDescription() {
        return this.description;
    }
    
    public abstract int getCost();
    
    public abstract int getSecurityLevel();
}
