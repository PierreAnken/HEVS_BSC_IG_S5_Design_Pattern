package Factory_2.house;


import Factory_2.wall.BricksWall;
import Factory_2.wall.Wall;

public class BricksHouse extends House {
    
    public BricksHouse() {
        this.name = "Typical dutch house";
    }

    @Override
    protected Wall createWall() {
        return new BricksWall();
    }

}
