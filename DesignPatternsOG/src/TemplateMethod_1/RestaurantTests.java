package TemplateMethod_1;

import TemplateMethod_1.template.ItalianRestaurant;
import TemplateMethod_1.template.Restaurant;
import TemplateMethod_1.template.SwissRestaurant;

public class RestaurantTests {

	public static void main(String[] args) {
		Restaurant ilGolossone = new ItalianRestaurant("Il Golossone - Zürich");
		Restaurant leVieuxChalet = new SwissRestaurant("Le Vieux Chalet - Gruyères");
		ilGolossone.prepareDinner();
		leVieuxChalet.prepareDinner();
	}
}
