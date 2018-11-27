package AbstractFactory_1.factories;

import AbstractFactory_1.doors.Door;
import AbstractFactory_1.walls.Wall;
import AbstractFactory_1.windows.Window;

public interface HouseFactory {

    public Wall createWall();
    public Door createDoor();
    public Window createWindow();

}
