package Composite;

public class Client_PlayerManager {

    public static void main(String[] args) {
        // Une liste d'objets en arbre avec des groupes et des éléments
        // qui implémentent la même interface
        //
        // Client: transmet un action à l'arbre d'objet
        // AbstractComponent : classe abstraite qui contient la definition des operations possibles
        // avec par default des erreurs
        // Composite : contient les éléments et définit le comportement par groupe
        // Leaf : définit le comportement pour l'élément


        Composite_Team FCSion = new Composite_Team("FC Sion");
        Composite_Team U20 = new Composite_Team("U20");
        Composite_Team U16 = new Composite_Team("U16");

        Leaf_Player manager = new Leaf_Player("Manager Mark");
        Leaf_Player paul = new Leaf_Player("Paul");
        Leaf_Player pierre = new Leaf_Player("Pierre");
        Leaf_Player jean = new Leaf_Player("Jean");
        Leaf_Player david = new Leaf_Player("David");
        Leaf_Player andre = new Leaf_Player("André");
        Leaf_Player boris = new Leaf_Player("Boris");

        FCSion.add(U20);
        FCSion.add(U16);
        FCSion.add(manager);

        U20.add(paul);
        U20.add(pierre);
        U20.add(jean);

        U16.add(david);
        U16.add(andre);
        U16.add(boris);


        System.out.println(FCSion.getName());

        U20.EnterField();
        U16.EnterField();

        andre.Shoot();
        boris.SimulateInjury();
        boris.Cry();
        david.Shoot();
        jean.Shoot();
        U16.Cry();

    }

}
