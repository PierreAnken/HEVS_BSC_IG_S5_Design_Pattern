package Builder_1;

import Builder_1.builder.HawaiianPizzaBuilder;
import Builder_1.builder.PizzaBuilder;
import Builder_1.builder.SpicyPizzaBuilder;
import Builder_1.director.Waiter;
import Builder_1.product.Pizza;

public class PizzaBuilderDemo {

	public static void main(String[] args) {
        Waiter waiter = new Waiter("Pizzaiolo Francesco");
        PizzaBuilder hawaiianPizzabuilder = new HawaiianPizzaBuilder();
        PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();

        waiter.setPizzaBuilder( hawaiianPizzabuilder );
        waiter.constructPizza("hawaiian");
        Pizza pizza = waiter.getPizza();
        System.out.println(waiter.name + " created a pizza: " + pizza);

        waiter.setPizzaBuilder( spicyPizzaBuilder );
        waiter.constructPizza("spicy");
        Pizza pizza2 = waiter.getPizza();
        System.out.println(waiter.name + " created a pizza: " + pizza2);

    }
}
