package Decorator_1;

public class __ExerciceData {

/*    A car producer wants to define an online application to allow his potential
customers to choose cars and to easily add new features at runtime in order to
compose themselves their car. Two criteria are essential for customers, namely
the price and the security level. Security is defined with points.
The highest the level, the better is security.

Security is dependent from the following features:
- breaking system
- stability
- engine
- anti-sliding system
- airbag(s)

As each security feature has its specific cost, adding a new one will influence the final price.

Other features as the color do not influence security but the price.

Design a class hierarchy and implement this application using the decorator pattern.
It should allow defining the security level and the price of the car. Define several types
of cars and at least five possible decorators (normal and security features).

The main is as follows:

    public class CarDecoratorLauncher {
        public static void main(String[] args) {
            CarDecoratorLauncher launcher = new CarDecoratorLauncher();
            launcher.launch();
        }
        public void launch() {
            Car car1 = new CarBerlin();
            car1 = new AirbagDecorator(car1);
            car1 = new AirbagDecorator(car1);
            car1 = new EngineDecorator(car1);
            car1 = new ColorDecorator(car1);
            printCarInfos(car1);

            Car car2 = new CarSport();
            car2 = new AntiSlidingSystemDecorator(car2);
            car2 = new BreakingSystemDecorator(car2);
            printCarInfos(car2);

            Car car3 = new CarBreak();
            car3 = new AirbagDecorator(car3);
            car3 = new EngineDecorator(car3);
            car3 = new ColorDecorator(car3);
            car3 = new AntiSlidingSystemDecorator(car3);
            car3 = new BreakingSystemDecorator(car3);
            printCarInfos(car3);
        }

        public void printCarInfos(Car car) {
            System.out.println("Car description : " + car.getDescription());
            System.out.println("Car cost : " + car.getCost());
            System.out.println("Car security level : " +car.getSecurityLevel());
            System.out.println();
        } }*/

}
