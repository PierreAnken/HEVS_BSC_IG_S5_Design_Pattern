package Factory_2.house;


import Factory_2.wall.GlassWall;
import Factory_2.wall.Wall;

public class GlassHouse extends House {
    
    public GlassHouse() {
        this.name = "Moder German house";
    }

    @Override
    protected Wall createWall() {
        return new GlassWall();
    }
    
}
