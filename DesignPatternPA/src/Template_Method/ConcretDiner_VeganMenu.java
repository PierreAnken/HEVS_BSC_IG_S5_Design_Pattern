package Template_Method;

public class ConcretDiner_VeganMenu extends AbstractDiner{

    @Override
    void prepareVegetables() {
        System.out.println("Préparation de la salade: carottes, choux-fleurs, andives, choux-rouges, tomates");
    }

    @Override
    void prepareMainMenu() {
        System.out.println("Au menu, encore de la salade");
    }

    @Override
    void prepareCheese() {

    }

    @Override
    void prepareDessert() {

    }

    @Override
    void prepareCoffee() {
        System.out.println("Un café sans sucre ni crème");
    }

    @Override
    boolean isVegan(){
        return true;
    }
}
