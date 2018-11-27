package AbstractFactory_1.factories;

import AbstractFactory_1.doors.*;
import AbstractFactory_1.walls.*;
import AbstractFactory_1.windows.*;

public class GermanHouseFactory implements HouseFactory {

    public Wall createWall() {
        return new GlassWall();
    }

    public Door createDoor() {
        return new LargeDoor();
    }

    public Window createWindow() {
        return new WindowToTheFloor();
    }

}
