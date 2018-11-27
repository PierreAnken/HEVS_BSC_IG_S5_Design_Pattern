package Builder;

abstract class AbstractBuilder_Car {

    protected Product_Car car;

    public void startBuildNewCar(String marque){
        car = new Product_Car(marque);
    }

    abstract void buildFreins();
    abstract void buildCouleur();
    abstract void buildPhares();
    abstract void buildPneus();

    public Product_Car getFinishedCar(){
        return car;
    }

}
