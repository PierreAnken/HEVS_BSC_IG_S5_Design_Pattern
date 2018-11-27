package Builder;

public class ConcreteBuilder_Ferrari extends AbstractBuilder_Car{
    @Override
    void buildFreins() {
        car.setFreins("système ABS de luxe");
    }

    @Override
    void buildCouleur() {
        car.setCouleur("rouge métalisée");
    }

    @Override
    void buildPhares() {
        car.setPhares("xénons");
    }

    @Override
    void buildPneus() {
        car.setPneus("chromés 18\"");
    }
}
