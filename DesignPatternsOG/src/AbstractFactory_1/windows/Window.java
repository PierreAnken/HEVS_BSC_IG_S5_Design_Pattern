package AbstractFactory_1.windows;

import AbstractFactory_1.walls.Wall;

public abstract class Window {

    protected String name;
    protected int price;
    private Wall wall;

    public void buildOnWall(Wall wall) {
        this.wall = wall;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}