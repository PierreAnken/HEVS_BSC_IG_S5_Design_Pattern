package AbstractFactory_1.walls;

import java.util.ArrayList;

public abstract class Wall {
    protected String name;
    protected int price;
    private ArrayList<Wall> neighbours = new ArrayList<Wall>();;

    
    public void bindTo(Wall w) {
        neighbours.add(w);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}
