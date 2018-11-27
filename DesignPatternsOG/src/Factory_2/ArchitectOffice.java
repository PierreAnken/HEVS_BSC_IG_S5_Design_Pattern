package Factory_2;

import Factory_2.house.BricksHouse;
import Factory_2.house.GlassHouse;
import Factory_2.house.House;
import Factory_2.house.WoodHouse;

public class ArchitectOffice {
    
    public static void main(String[] args) {
        House house1 = new GlassHouse();
        house1.buildHouse();
        house1.calculatePrice();

        House house2 = new BricksHouse();
        house2.buildHouse();
        house2.calculatePrice();

        House house3 = new WoodHouse();
        house3.buildHouse();
        house3.calculatePrice();

    }

}