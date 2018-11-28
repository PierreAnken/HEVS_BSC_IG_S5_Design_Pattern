package Template_Method;

public class ConcreteDiner_SteakMenu extends AbstractDiner{

    @Override
    void prepareVegetables() {
        System.out.println("Une petite salade en entrée");
    }

    @Override
    void prepareMainMenu() {
        System.out.println("Un énorme steak de cheval en plat principal");
    }

    @Override
    void prepareCheese() {
        System.out.println("Une planchette de fromages de la région");
    }

    @Override
    void prepareDessert() {
        System.out.println("Un tiramisu par fourmandise");
    }

    @Override
    void prepareCoffee() {
        System.out.println("Un renversé pour terminer");
    }

}