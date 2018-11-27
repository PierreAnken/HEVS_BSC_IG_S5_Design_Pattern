package Decorator_2;

import Decorator_2.component.Montana;
import Decorator_2.component.Stay;
import Decorator_2.component.Verbier;
import Decorator_2.decorator.HotelRoom;
import Decorator_2.decorator.SkiPass;
import Decorator_2.decorator.Wellness;

public class TouristicShopLauncher {

	public static void main(String[] args) {
		
		Stay verbier = new Verbier();
		verbier = new SkiPass(verbier);
		verbier = new HotelRoom(verbier);
		
		displayStay(verbier);
		
		Stay montana = new Montana();
		montana = new Wellness(montana);
		montana = new SkiPass(montana);
		montana = new SkiPass(montana);
		
		displayStay(montana);

	}
	
	public static void displayStay(Stay stay){
		System.out.println("Package stay : " + stay.getDescription());
		System.out.println("Cost : " + stay.getCost() + "\n");
	}

}