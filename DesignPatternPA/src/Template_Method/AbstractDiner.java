package Template_Method;

abstract class AbstractDiner {

    protected final void prepareDiner(){
        serveWater();
        prepareVegetables();
        prepareMainMenu();

        if(!isVegan()){
            prepareCheese();
            prepareDessert();
        }
        prepareCoffee();
        cleanTable();
    }

    final void serveWater(){
        System.out.println("Un verre d'eau en boisson");
    }

    final void cleanTable(){
        System.out.println("Nettoyage de la table");
    }

    abstract void prepareVegetables();
    abstract void prepareMainMenu();
    abstract void prepareCheese();
    abstract void prepareDessert();
    abstract void prepareCoffee();

    boolean isVegan(){
        return false;
    }
}
