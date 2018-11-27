package Factory_2.wall;

import java.util.ArrayList;
import java.util.List;

public abstract class Wall {
    protected String name;
    protected int price;
    private List<Wall> neighbours = new ArrayList<Wall>();;

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
