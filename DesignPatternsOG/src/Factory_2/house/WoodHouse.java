package Factory_2.house;


import Factory_2.wall.Wall;
import Factory_2.wall.WoodWall;

public class WoodHouse extends House {
    
    public WoodHouse() {
        this.name = "Swiss wood chalet";
    }

    @Override
    protected Wall createWall() {
        return new WoodWall();
    }
    
}
