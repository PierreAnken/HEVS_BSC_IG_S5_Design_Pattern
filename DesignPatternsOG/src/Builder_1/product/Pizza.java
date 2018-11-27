package Builder_1.product;

public class Pizza {
	private String name = "";
	private String dough = "";
    private String sauce = "";
    private String topping = "";
   
    public Pizza(String name) {
        this.name = name;
    }
    
    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }
    
    public String toString() {
		return "Pizza " + name + " with dough " + dough + ", sauce " + sauce + " and topping " + topping;
 
    }
}
