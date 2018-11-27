package Builder;

public class Client_Main {
    public static void main(String[] args) {

        // Un objet est construit étape par étape permettant une modulation
        //
        // Client : genère un concreteBuilder et un director et fait créer au director le product
        // Director : recoit un builder et l'execute sur demande du client
        // AbstractBuilder : classe abstraite qui définit les étapes de création du product
        // ConcreteBuilder : définit les paramètres de fabrication, retourne le product
        // Product : l'élément créé

        AbstractBuilder_Car ferrariBuilder = new ConcreteBuilder_Ferrari();
        AbstractBuilder_Car renaultBuilder = new ConcretBuilder_Renault5();

        Director_CarConstructor employee = new Director_CarConstructor();

        //create the first product
        employee.setBuilder(ferrariBuilder);
        employee.constructCar("Ferrari");
        Product_Car ferrari = employee.getFinishedCar();
        System.out.println(ferrari);

        //create the second product
        employee.setBuilder(renaultBuilder);
        employee.constructCar("Renault 5");
        Product_Car renault5 = employee.getFinishedCar();
        System.out.println(renault5);
    }
}
