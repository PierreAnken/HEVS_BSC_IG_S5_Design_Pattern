package Factory_1;

import Factory_1.cars.*;
import Factory_1.creator.CarCreator;
import Factory_1.creator.CoupeCreator;
import Factory_1.creator.MinivanCreator;
import Factory_1.creator.PickupCreator;

public class Program {
	public static void main(String[] args) {

        CarCreator coupeCreator = new CoupeCreator();
        CarCreator minivanCreator = new MinivanCreator();
        CarCreator pickupCreator = new PickupCreator();

        Car c1 = coupeCreator.orderCar("red");
        System.out.println("Car " + c1.getName() + " " + c1.getColor() + " has been ordered.");

        Car c2 = minivanCreator.orderCar("red");
        System.out.println("Car " + c2.getName() + " " + c2.getColor() + " has been ordered.");

        Car c3 = pickupCreator.orderCar("red");
        System.out.println("Car " + c3.getName() + " " + c3.getColor() + " has been ordered.");

	}
}
