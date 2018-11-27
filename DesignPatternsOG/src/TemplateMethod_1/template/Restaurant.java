package TemplateMethod_1.template;

public abstract class Restaurant {

	protected String name;
	
	final public void prepareDinner() {
		System.out.println("--- " + name + " starts preparing dinner.");
		serveWater();
		prepareVegetables();
		prepareMainMenu();
		prepareCheese();
		preparDessert();
		prepareCoffee();
		cleanTable();
	}
	
	private void serveWater(){
		System.out.println("I am serving water.");
	}
	private void cleanTable() {
		System.out.println("and cleaning the talbe");
	}
	
	abstract void prepareVegetables();
	abstract void prepareMainMenu();
	abstract void prepareCheese();
	abstract void preparDessert();
	abstract void prepareCoffee();
	
}
