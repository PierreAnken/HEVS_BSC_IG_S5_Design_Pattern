package AbstractFactory_1.factories;

import AbstractFactory_1.doors.*;
import AbstractFactory_1.walls.*;
import AbstractFactory_1.windows.*;

public class SwissWoodChaletFactory implements HouseFactory {

    public Wall createWall() {
        return new WoodWall();
    }

    public Door createDoor() {
        return new ThinDoor();
    }

    public Window createWindow() {
        return new WindowWithStructure();
    }

}