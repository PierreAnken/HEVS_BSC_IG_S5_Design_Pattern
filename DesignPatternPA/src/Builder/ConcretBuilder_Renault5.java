package Builder;

public class ConcretBuilder_Renault5 extends AbstractBuilder_Car {

    @Override
    void buildFreins() {
        car.setFreins("de base");
    }

    @Override
    void buildCouleur() {
        car.setCouleur("bleu-grise");
    }

    @Override
    void buildPhares() {
        car.setPhares("halogènes");
    }

    @Override
    void buildPneus() {
        car.setPneus("de base 15\"");
    }
}
