package AbstractFactory_1.factories;

import AbstractFactory_1.doors.Door;
import AbstractFactory_1.walls.Wall;
import AbstractFactory_1.windows.Window;

public class House {

    private HouseFactory houseFactory;

    private String name = "";

    private Wall southWall;
    private Wall northWall;
    private Wall westWall;
    private Wall eastWall;
    private Window southWindow;
    private Window westWindow;
    private Door eastDoor;

    public House(String name, HouseFactory houseFactory) {
        this.name = name;
        this.houseFactory = houseFactory;
    }

    public void buildHouse() {
        southWall = createWall();
        northWall = createWall();
        westWall = createWall();
        eastWall = createWall();

        southWall.bindTo(westWall);
        westWall.bindTo(southWall);

        westWall.bindTo(northWall);
        northWall.bindTo(westWall);

        northWall.bindTo(eastWall);
        eastWall.bindTo(northWall);

        eastWall.bindTo(southWall);
        southWall.bindTo(eastWall);

        eastWall.bindTo(southWall);
        southWall.bindTo(eastWall);

        southWindow = createWindow(southWall);
        westWindow = createWindow(westWall);

        eastDoor = createDoor(eastWall);

    }

    public void calculatePrice() {
        System.out.println("Total price of " + this.name + " is " + getHousePrice());
    }

    private int getHousePrice() {
        return southWall.getPrice() 
                + westWall.getPrice()
                + northWall.getPrice()
                + eastWall.getPrice()
                + southWindow.getPrice()
                + westWindow.getPrice()
                + eastDoor.getPrice();
    }

    private Wall createWall() {
        return houseFactory.createWall();
    }

    private Door createDoor(Wall w) {
        Door door = houseFactory.createDoor();
        door.buildOnWall(w);
        return door;
    }

    private Window createWindow(Wall w) {
        Window window = houseFactory.createWindow();
        window.buildOnWall(w);
        return window;
    }

    public HouseFactory getHouseFactory() {
        return houseFactory;
    }

    public void setHouseFactory(HouseFactory houseFactory) {
        this.houseFactory = houseFactory;
    }

}
