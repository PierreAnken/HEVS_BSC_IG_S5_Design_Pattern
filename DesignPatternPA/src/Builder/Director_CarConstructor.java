package Builder;

public class Director_CarConstructor {

    private AbstractBuilder_Car builder;

    public void setBuilder(AbstractBuilder_Car builder){
        this.builder = builder;
    }

    public void constructCar(String marque){
        builder.startBuildNewCar(marque);
        builder.buildCouleur();
        builder.buildFreins();
        builder.buildPhares();
        builder.buildPneus();
    }

    public Product_Car getFinishedCar(){
        return builder.car;
    }

}
