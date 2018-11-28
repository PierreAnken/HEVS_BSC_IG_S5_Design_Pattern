package Template_Method;

public class Main_Restaurant {

    // Un algorithme prédefinit (méthode finale) avec une suite de métodes internes
    // dont certains sont fixes(finales) et d'autre abstraites à définir par la subclass
    //
    // AbstractClass : inclut un proccesus qui définit la suite logique des etapes
    // ConcreteClass : redifinit certaines étapes du processus

    public static void main(String[] args) {

        System.out.println(" == Preparation du menu vegan == ");
        new ConcretDiner_VeganMenu().prepareDiner();

        System.out.println("\n == Preparation du menu steak == ");
        new ConcreteDiner_SteakMenu().prepareDiner();
    }


}
