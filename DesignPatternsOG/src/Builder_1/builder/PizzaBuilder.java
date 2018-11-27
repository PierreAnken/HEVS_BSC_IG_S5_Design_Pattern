package Builder_1.builder;

import Builder_1.product.Pizza;

public abstract class PizzaBuilder {

	protected Pizza pizza;

    public void createNewPizzaProduct(String name) {
        pizza = new Pizza(name);
    }

    public abstract void buildDough();
    public abstract void buildSauce();
    public abstract void buildTopping();

    public Pizza getPizza() {
        return pizza;
    }
}
