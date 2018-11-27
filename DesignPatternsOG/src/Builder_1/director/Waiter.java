package Builder_1.director;

import Builder_1.builder.PizzaBuilder;
import Builder_1.product.Pizza;

public class Waiter {

	private PizzaBuilder pizzaBuilder;
	public String name;
	
	public Waiter(String name) {
		this.name = name;	
	}
	
	public void setPizzaBuilder(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public void constructPizza(String name) {
        pizzaBuilder.createNewPizzaProduct(name);
        pizzaBuilder.buildDough();
        pizzaBuilder.buildSauce();
        pizzaBuilder.buildTopping();
    }

    public Pizza getPizza() {
        return pizzaBuilder.getPizza();
    }
}
